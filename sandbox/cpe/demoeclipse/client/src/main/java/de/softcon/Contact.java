package de.softcon;

import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(className="ContactData", targetId="", properties ={
        @Property(name = "id", type = int.class),
        @Property(name="city", type=String.class),
        @Property(name="street", type=String.class),
        @Property(name="number", type=String.class),
        @Property(name="treeclass", type=String.class)
})
public class Contact
{

}
