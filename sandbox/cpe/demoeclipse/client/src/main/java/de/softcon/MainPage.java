package de.softcon;


import net.java.html.json.ComputedProperty;
import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.OnPropertyChange;
import net.java.html.json.Property;
import de.softcon.business.PageType;

@Model(className = "MainPageData", targetId = "", properties = {
        @Property(name = "persons", type = PersonData.class, array = true),
        @Property(name = "selectedPerson", type = PersonData.class),
        @Property(name = "currentPage", type = String.class) })
public class MainPage
{
    public MainPage()
    {
    }

    //TODO this seems to not observe changes (e.g. table refresh)
    /*@ComputedProperty
    static java.util.List<PersonData> persons()
    {
        return PersonModel.getInstance().getPersonsInput();
    }*/

    @ComputedProperty
    static PersonData newPerson()
    {
        return new PersonData();
    }

    @Function
    static void saveNewPerson(MainPageData myModel, PersonData data)
    {
        myModel.getPersons().add(data);
        navigateToHomePage(myModel);
    }

    @Function
    static void removePerson(MainPageData myModel, PersonData data)
    {
        myModel.getPersons().remove(data);
        
        //update selected person
        if (myModel.getPersons().isEmpty())
        {
            myModel.setSelectedPerson(null);
        }
        else
        {
            myModel.setSelectedPerson(myModel.getPersons().get(0));
        }
    }

    @Function
    static void navigateToDetailsPage(MainPageData myModel)
    {
        myModel.setCurrentPage(PageType.DETAILS.toString());
    }

    @Function
    static void navigateToSignupPage(MainPageData myModel)
    {
        myModel.setCurrentPage(PageType.SIGNUP.toString());
    }

    @Function
    static void navigateToHomePage(MainPageData myModel)
    {
        myModel.setCurrentPage(PageType.HOME.toString());
    }

    @Function
    static void selectPerson(MainPageData myModel, PersonData data)
    {
        myModel.setSelectedPerson(data);
    }

    @Function
    static void selectContact(MainPageData myModel, ContactData data)
    {
        for (PersonData person : myModel.getPersons())
        {
            for (ContactData contact : person.getContacts())
            {
                if (contact.getId() == data.getId())
                {
                    myModel.setSelectedPerson(person);
                    break;
                }
            }
        }
    }
    
    /*@OnPropertyChange({"age"})
    static void validateAge()
    {
        if (myModel.getSelectedPerson().getAge() > 15) 
        {
            System.out.println("age in the model:" + myModel.getSelectedPerson().getAge());
        }
    }*/
}
