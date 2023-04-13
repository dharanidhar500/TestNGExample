package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;

public class AppTest{
    @Test(priority = 1)
    void openBrowser(){
        System.out.println("Opening Browser");
    }
    @Test(priority = 2 )
    void clickUMS(){
        System.out.println("Clicking on UMS");
    }
    @Test(priority = 3)
    void openhomePage(){
        System.out.println("Opening homePage");
    }
    void closeUMS(){
        System.out.println("closing of UMS");
    }
    @Test(priority = 5)
    void closeBrowser(){
        System.out.println("Closing of Browser");
    }
}
