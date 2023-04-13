package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

//    @DataProvider(name = "mylogindata")
//    public Object[][] getloginData(){
//        Object[][] data = {{11903449, "DHARANI","dharanidhar510@gmail.com"},{120345,"Piyush""Piyush580@gmail.com"}};
//        return data;
//    }
    @Test(dataProvider = "mylogindata",dataProviderClass = DataClass1.class)
    public void loginForm(int reg,String name, String email){
        System.out.println(reg +" -> " + name + " ->" +email);
    }
}
