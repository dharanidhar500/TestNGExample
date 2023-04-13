package org.example;

import org.testng.annotations.Test;

public class AppTest1 {
    @Test(priority = 1)
public void testlogin(){
    System.out.println("login the test");
}
@Test(priority = 2)
public void testsearch(){
    System.out.println("search the test");
}
@Test(priority = 3)
public void testcheckout() {
    System.out.println("checkout the test");
}
}
