package src.testng;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class day2 {

    @Test(groups = {"Smoke"})
    public void Error(){
        System.out.println("Error Message");
    }

    @BeforeTest
    public void before(){
        System.out.println("This is before test message day 2");
    }

    @BeforeSuite
    public void bsuite(){
        System.out.println("THIS IS BEFORE SUITE MESSAGE");
    }

    @AfterTest
    public void after(){
        System.out.println("This is AFTER test message #2 day2");
    }

}
