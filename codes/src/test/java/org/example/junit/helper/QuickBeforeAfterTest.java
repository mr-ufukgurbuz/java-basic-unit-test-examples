package org.example.junit.helper;

import org.junit.*;

public class QuickBeforeAfterTest {

    // Runs only one before every test cases in class
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    // Runs before every test cases
    @Before
    public void setup(){
        System.out.println("Before Test");
    }

    @Test
    public void test1() {
        System.out.println("test1 executed");
    }

    @Test
    public void test2() {
        System.out.println("test2 executed");
    }

    // Runs after every test cases
    @After
    public void teardown() {
        System.out.println("After test");
    }

    // Runs only one after every test cases in class
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

}
