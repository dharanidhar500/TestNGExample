package org.example;

import org.testng.annotations.*;

public class Test2 {
    @BeforeTest
    void beforetest(){
        System.out.println("this will run before the test");
    }
    @AfterTest
    void aftertest(){
        System.out.println("this will run after the test");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will run after every method");
    }
    @AfterClass
    void afterclass(){
        System.out.println("This will run after class");
    }
    @Test
    void test4(){
        System.out.println("This is Test 2");
    }
    @Test
    void test5(){
        System.out.println("This is Test 3");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This will run after after method");
    }
}
