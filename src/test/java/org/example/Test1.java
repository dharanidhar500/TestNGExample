package org.example;

import org.testng.annotations.*;

public class Test1 {
    @BeforeSuite
    void beforesuie(){
        System.out.println("this is before suite");
    }
    @AfterSuite
    void aftersuite(){
        System.out.println("this is after suite");
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
    void test2(){
        System.out.println("This is Test 2");
    }
    @Test
    void test3(){
        System.out.println("This is Test 3");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This will run after after method");
    }
}