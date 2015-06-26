package de.softcon;


import net.java.html.boot.BrowserBuilder;
import de.softcon.business.PageType;
import de.softcon.business.PersonModel;

public final class Main
{
    private Main()
    {

    }

    public static void main(String... args) throws Exception
    {
        BrowserBuilder.newBrowser().loadPage("pages/index.html").loadClass(Main.class).invoke("onPageLoad", args).showAndWait();
        System.exit(0);
    }

    public static void onPageLoad() throws Exception
    {
        MainPageData mainPageData = new MainPageData();
        mainPageData.getPersons().addAll(PersonModel.getInstance().getPersonsInput());
        mainPageData.setSelectedPerson(PersonModel.getInstance().getPersonsInput().get(0));
        mainPageData.setCurrentPage(PageType.HOME.toString());
        mainPageData.applyBindings();
    }

    //TODO lose data
    public static void onSecondPageLoad() throws Exception
    {
        SecondPageData secondPageData = new SecondPageData();
        secondPageData.setPerson(PersonModel.getInstance().getPersonsInput().get(0));
        secondPageData.applyBindings();
    }
}
