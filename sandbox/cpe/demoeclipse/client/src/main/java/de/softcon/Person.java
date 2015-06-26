package de.softcon;


import net.java.html.json.ComputedProperty;
import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(className = "PersonData", targetId = "", properties = {
        @Property(name = "id", type = int.class),
        @Property(name = "firstName", type = String.class),
        @Property(name = "lastName", type = String.class),
        @Property(name = "age", type = int.class),
        @Property(name = "treeclass", type = String.class),
        @Property(name = "contacts", type = ContactData.class, array = true) })
final class Person
{
    @ComputedProperty
    static String personInfo(String firstName, String lastName, int age)
    {
        return firstName + " " + lastName + " ( age " + age + " )";
    }

}
