//Open points:
//-	Make the whole language consistent – named parameters
//-	Calling vs definition {} vs ()
//-	Validators (maybe closure type definition)
//Thinking about:
//-	Integration of services : GPS, SMS,… (OSGI in IoT)

datatype String mappedto java.lang.String config init "null" persistable
datatype GenderEnum mappedto com.nagarrro.app.domain.GenderEnum config init "0" persistable

namespace com.nagarrro.mobileapp.domain
{ 
	domainentity Person
	{
		ref addresses one2many person : com.nagarrro.app.domain.Address
	}
	
	domainentity Address
	{
		street : String
		city : String
		^default: bool
	}
}

namespace com.nagarrro.app.business
{ 
	interface PersonController
	{
		operation @rest{"/persons", Method.GET} listPersons(): Person[]
		operation @rest{"/person/{id}", Method.GET} getPerson(long id): Person
		operation @rest{"/person/add", Method.POST} addPerson(Person person): Person
		operation @rest{"/person/update", Method.PUT} updatePerson(Person updatePerson): Person
	}
	
	stateless-component PersonControllerProvider
	{
		requires personRepository : PersonRepository
		provides personController : PersonController
	}
	
	interface PersonRepository
    {
        operation store(Person person)  : void
        operation findAll() : Person[]
        operation findById(long id) : Person
    }
    
    domain-repository for Person PersonRepositoryProvider
    {
       provides personRepository : PersonRepository
    }
}


namespace com.nagarrro.app.ui
{	
	
	interface PersonController
	{
		operation @rest{"/persons", Method.GET} listPersons(): Person[]
		operation @rest{"/person/{id}", Method.GET} getPerson(long id): Person
		operation @rest{"/person/add", Method.POST} addPerson(Person person): Person
		operation @rest{"/person/update", Method.PUT} updatePerson(Person updatePerson): Person
	}
	
	stateless-component PersonControllerProvider
	{
		requires personRepository : PersonRepository
		provides personController : PersonController
	}
	
	interface PersonRepository
    {
        operation store(Person person)  : void
        operation findAll() : Person[]
        operation findById(long id) : Person
    }
    
    domain-repository for Person PersonRepositoryProvider
    {
       provides personRepository : PersonRepository
    }
}


namespace com.nagarrro.app.ui
{
}

system mobileApp
{
	business
	{
		instance personRepositoryProvider : PersonRepositoryProvider
		instance personControllerProvider : PersonControllerProvider
		{
			personRepository to personRepositoryProvider => personRepository
		}
	}
	
	ui
	{
	  	main(appName : "",appVersion : "", devices : [iphone, ipad, android4, android2] ,	entry  : PersonListScreen,	generalStyle: "maybe a file with css")


		screen allscreenshere
		{
			screens 
	     	{
	     			Layout(type : "grid", columns : 2)
			        {
			     		screen PersonListScreen1
			     		screen PersonDetailScreen
	     			}
			}
		}
			
			
			
		screen PersonListScreen1
		{
			model
			{
				persons : Person[] ordered
				person : Person
			}

			view 
     		{
     			layout(type : "grid", columns : 2)
		        {
		            list personListId ( labelprovider: (p:Person | p.name + " " + p.age) ,   cssItem: (p:Person | (p.age<10?"cssYesClass":"cssNoClass") ),    tooltip: (p:Person | p.age )  ) 
					button personListAdd (resourceKey : "PersonListScreen.add", style : "red")
				}
			}
			
			controller
			{
				   // standard for all screens: databinding + ui
				   initaction
				   {
	    			   	 persons setto restcall(url: "/persons", returnType:List)
	    			   	
					     persons bindto personListId.values
					     person bindto personListId.selection

					     addPersonSelection listenon personListAdd.onSelection
				   }
			   
			         uiaction listEntrySelection
			         {
			         	person setto personListId.selection
			            execute goToPersonDetail
			         }
			         
			         uiaction addPersonSelection
			         {
			            model.person setto Person()
			            execute goToPersonDetail
			         }
			         
			         uiaction goToPersonDetail
			         {
			         	smsService.sendSms(message:"fafd")
			         	p.age setto gpsService.getCurrentLocation
			            navigateto PersonDetailScreen(personId : person.id, aParam: "asdfasfasfasdf")
			         }
		      }
    	
		}
		
		
		screen PersonDetailScreen 
		{
			entryparameters
			{
				personId : Long
				aParam: String
			}
			
			model
			{
				person : Person
			}
			
			view 
			{
				layout(type "grid", columns 2)
		        {
		            label someid (resourceKey:"PersonDetail.name")
		            text textPersonNameId (style:"")
		            label labelId (resourceKey:"PersonDetail.age")
		            text textPersonAgeId()
					text textPersonAgeId()
					image imagePerson (path:"images/image.png")
				/*  radiobuttongroup gender()
					{
					     	radiobutton one(value:"1" )
					     	radiobutton two(value:"2" )
					}*/
 	 		 	    layout(type:"grid", columns:3)
			    	{
							//....			    			
			    	}
				}
            }
			
			controller 
			{
			   // standard for all screens: databinding + ui
			   initaction
			   {
			   
			     //databindings
			      person.name bindto textPersonNameId.text
				  person.age bindto textPersonAgeId.text
			      enumDataSource(enumClassName:"com.nagarrro.app.domain.GenderEnum") bindto comboPersonGenderId.values
			       
			      // ui listeners
			      updateButtonSelection listento PersonListScreen.updateButtonId.onSelection
			      goToPersonList listento PersonListScreen.backButtonId.onSelection
			      
			      //validation
			      one validateon textPersonNameId.text
			      two validateon textPersonAgeId.text
	 				
			      person setto restcall(url:"/person/{id}", returnType:Person, id:param1)
			    }

				validator
				{
					  ///???
					  condition one (value : String | value.length > 10) 
					  condition two (c : int | c == 10)
					  condition three (one and two)
				}

		         uiaction navigateToPersonList
		         {
		            navigateto PersonListScreen
		         }
		         
		         uiaction updateButtonSelection
		         {
		            person setto restcall(url:"/person/save", returnType:Person, updatePerson : person) 
		            execute navigateToPersonList
		         }
      }
			
 }//ui
		
}//system