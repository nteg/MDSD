package de.softcon.business;


import java.util.ArrayList;
import java.util.List;

import de.softcon.ContactData;
import de.softcon.PersonData;

public class PersonModel
{

    private static PersonModel INSTANCE;

    private java.util.List<PersonData> personsInput;

    public PersonModel()
    {
        this.personsInput = retrievePersons();
    }

    public static PersonModel getInstance()
    {
        if (INSTANCE == null) INSTANCE = new PersonModel();
        return INSTANCE;
    }

    private java.util.List<PersonData> retrievePersons()
    {
        List<PersonData> ret = new ArrayList<PersonData>();

        int treeClassIndex = 0;
        for (int i = 1; i < 6; i++)
        {
            treeClassIndex++;

            PersonData person = new PersonData();
            person.setId(i);
            person.setFirstName("Firstname" + i);
            person.setLastName("Lastname" + i);
            person.setAge(i);
            person.setTreeclass("treegrid-" + treeClassIndex);

            int parentIndex = treeClassIndex;
            for (int j = 0; j < 3; j++)
            {
                treeClassIndex++;

                ContactData contact = new ContactData();
                contact.setId(i * 10);
                contact.setCity("City: [" + i + j + "]");
                contact.setStreet("Street: [" + i + j + "]");
                contact.setNumber("Number: [" + i + j + "]");

                String parentClassRef = "treegrid-parent-" + parentIndex;
                contact.setTreeclass("treegrid-" + treeClassIndex + " "
                        + parentClassRef);
                person.getContacts().add(contact);
            }

            ret.add(person);
        }

        return ret;
    }

    public java.util.List<PersonData> getPersonsInput()
    {
        return personsInput;
    }

}
