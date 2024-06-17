package org.example.homework_25;

import org.junit.jupiter.api.*;


public class MainTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("testing has started");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("test started");
    }

    @Test
    public void test_func_helloMaven(){
        Assertions.assertEquals("Hello Maven", Main.helloMaven());
    }

    @Test
    public void test_func_helloJUnit(){
        Assertions.assertEquals("Hello JUnit", Main.helloJUnit());
    }

    @AfterEach
    void afterEach(){
        System.out.println("test ended");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("testing has ended");
    }
}