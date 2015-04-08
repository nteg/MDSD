
/*
NTEG discussion about open points.
From open points:
-	Map/bind  - more expressive
-	Re-usage of screens/views
-	Keywords
-	Others maybe
 */

//UI action with big letters camel case
//UI components big letters camel case
//separator , or newline
// : is missing, should we add it ?

// () only UI components

system mobileApp
{
	business
	{
		//...
	}
	
	ui
	{
	  	main( 
	  		appName : "" 
	  		appVersion : ""    
	  		devices : [iphone, ipad, android4, android2]  
	  		entry  : "PersonListScreen"
	  	}
		

			screen All
			{
				view 
		     		{
		     			Layout(type : "grid", columns : 2)
				        {
				     			PersonListScreen1,PersonListScreen2, PersonListScreen3
		     			}
					}
			}
			
			
			
		screen PersonListScreen1
		{
			model
			(
				persons : Person[] ordered
				person : Person
			)

			view 
     		{
     			layout(type : "grid", columns : 2)
		        {
		            list personListId (resourceKey : "PersonDetail.name")
					button personListAdd (resourceKeyText : "personList.add", style : "")
				}
			}
			
			controller
			{
				   // standard for all screens: databinding + ui
				   screenInitAction initaction1
				   {
					     map model.persons to personListId.values 
					     //todo what attribute to display - not from model 
					     map model.persons.name to personListId.display
					     map model.person to personListId.selection
					     
					     bind listEntrySelection on personListId.onSelection
					     bind addPersonSelection on personListAdd.onSelection
					     
					     persons to restcall(url: "/persons", returnType:List)
				   }
			   
			         uiAction listEntrySelection
			         {
			         	map model.person to personListId.selection
			            execute goToPersonDetail
			         }
			         
			         uiAction addPersonSelection
			         {
			            map model.person to new Person()
			            execute goToPersonDetail
			         }
			         
			         uiAction goToPersonDetail
			         {
			            screen PersonDetailScreen(model.person.id)
			         }
			         
			         uiAction navigate 
			         {
			         }
		      }
    	
		}
		
		
		screen PersonDetailScreen (param1 Long)
		{
			model
			{
				person : Person
			}
			
			view 
			{
				layout(type "grid", columns 2)
		        {
		            label someid (resourceKey "PersonDetail.name")
		            text textPersonNameId (style "")
		            label labelId (resourceKey "PersonDetail.age")
		            text textPersonAgeId()
					text textPersonAgeId()
					image imagePerson (path "images/image.png")
 	 		 	    layout(type "grid", columns 3)
			    	{
		        	}
				}
            }
			
			controller 
			{
			   // standard for all screens: databinding + ui
			   screenInitAction action1
			   {
			   
			     //databindings
			      person.name bindto textPersonNameId.text
				  map person.age to textPersonAgeId.text
				  map person.gender to comboPersonGenderId.selection 
			      map EnumDataSource(enumClassName "com.nagarrro.app.domain.GenderEnum") to comboPersonGenderId.values
			       
			      // ui listeners
			      updateButtonSelection listento PersonListScreen.updateButtonId.onSelection
			      bind goToPersonList to PersonListScreen.backButtonId.onSelection
			      
			      //validation
			      (String, (length > 10)) validateon textPersonNameId.text
			      bind validator(Integer, (value == 10)) to textPersonNameId.text
			      
			      
			       person init restcall(url "/person/{id}", returnType Person, id param1)
			      }
			      
			   
			   
			   				         
		         uiAction navigateToPersonList
		         {
		            screen PersonListScreen
		            //something else
		            }
		         }
		         
		         uiAction updateButtonSelection
		         {
		            save model.person
		            execute navigateToPersonList
		         }
      }
			
 }//ui
		
}//system

