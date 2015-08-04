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
	interface Email
	{
		 operation sendEmail(String text, String to)  : void
	}
	
	stateless-component EmailService
	{
		 provides email : Email
	}
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

		instance emailService : EmailService

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
	    			   	 set persons to restcall(url: "/persons", returnType:List)
	    			   	
					     bind persons to personListId.values
					     bind person to personListId.selection

					     attach addPersonSelection to personListAdd.onSelection
				   }
			   
			         uiaction listEntrySelection
			         {
			         	set person to personListId.selection
			            execute goToPersonDetail
			         }
			         
			         uiaction addPersonSelection
			         {
			            set model.person to Person
			            execute goToPersonDetail
			         }
			         
			         uiaction goToPersonDetail
			         {
			         	emailService.sendEmail(text:"Bla", to:"me")
			         	smsService.sendSms(message:"fafd")
			         	set p.age to gpsService.getCurrentLocation()
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
			      bind person.name to textPersonNameId.text
				  bind person.age to textPersonAgeId.text
			      bind enumDataSource(enumClassName:"com.nagarrro.app.domain.GenderEnum") to comboPersonGenderId.values
			       
			      // ui listeners
			      attach updateButtonSelection to PersonListScreen.updateButtonId.onSelection
			      attach goToPersonList to PersonListScreen.backButtonId.onSelection
			      
			      //validation
			      validate one on textPersonNameId.text
			      validate two on textPersonAgeId.text
	 				
			      set person to restcall(url:"/person/{id}", returnType:Person, id:param1)
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
		            set person to restcall(url:"/person/save", returnType:Person, updatePerson : person) 
		            execute navigateToPersonList
		         }
      }
			
 }//ui
		
}//system