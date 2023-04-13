package org.example;

import org.testng.annotations.Test;

public class GroopsEg {
    @Test(groups = "regression")
    void Example1(){
        System.out.println("this is Example1");
    }
    @Test(groups = "Critical")
    void Example2(){
        System.out.println("this is Example2");
    }
    @Test(groups = "Critical")
    void Example3(){
        System.out.println("this is Example3");
    }
    @Test(groups = "regression")
    void Example4(){
        System.out.println("this is Example4");
    }
    @Test(groups ={ "Critical","regression"})
    void Example5(){
        System.out.println("this is Example5");
    }
    @Test(groups = "Critical")
    void Example6(){
        System.out.println("this is Example6");
    }
}
