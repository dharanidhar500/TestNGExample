package org.example;

import org.testng.annotations.DataProvider;

public class DataClass1 {

    @DataProvider(name = "mylogindata")
    public Object[][] getloginData(){
        Object[][] data = {{11903449, "DHARANI","dharanidhar510@gmail.com"},{120345,"Piyush","Piyush580@gmail.com"}};
        return data;
    }
}
