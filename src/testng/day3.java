package src.testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {

    @Test
    public void day3(){
        System.out.println("This is day 3 message");
    }

    @Test
    public void day3_1(){
        System.out.println("This is day 3-1 message");
    }

    @BeforeSuite
    public void bsuite(){
        System.out.println("THIS IS BEFORE SUITE MESSAGE");
    }

}
