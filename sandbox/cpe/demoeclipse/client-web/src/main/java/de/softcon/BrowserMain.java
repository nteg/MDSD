package de.softcon;


public class BrowserMain
{

    private BrowserMain()
    {

    }

    public static void main(String... args) throws Exception
    {
        Main.onPageLoad();
    }
    
    public static void showSecondPage() throws Exception
    {
        Main.onSecondPageLoad();
    }
}
