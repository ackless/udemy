package src.testng;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
    @Test(groups = {"Smoke"})
    public void Base(){
        System.out.println("Hello!");
    }

    @Test
    public void SecondTest(){
        System.out.println("Bye");
    }

    @BeforeTest
    public void before(){
        System.out.println("This is before test message day 1");
    }

    @AfterTest
    public void after(){
        System.out.println("This is AFTER test message #1 day 1");
    }

}
