package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
    @Test
    void login(){
        System.out.println("Login to UMS");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"login"})
    void accessHomePage(){
        System.out.println("HomePage Accessed");
    }
    @Test(dependsOnMethods = {"login","accessHomePage"}, alwaysRun = true,enabled = false)
    void AccessAnnouncement(){
        System.out.println("View Announcement");
    }
}
