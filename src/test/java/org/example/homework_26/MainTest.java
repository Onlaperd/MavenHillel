package org.example.homework_26;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MainTest {

    private static int[][] matrix;
    private static int[] array;

    @BeforeAll
    static void beforeAll(){
        System.out.println("testing has started");
        matrix = new int[][]{
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        array = new int[]{1, 2, 3};
    }

    @Test
    public void test_isMatrixSquare(){
        Assertions.assertTrue(Main.isMatrixSquare(matrix));
    }

    @Test
    public void test_averageArrayElement(){
        Assertions.assertEquals(2, Main.averageArrayElement(array));
    }

    @AfterAll
    static void afterAll(){
        System.out.println("testing has ended");

        matrix = null;
        array = null;
    }
}