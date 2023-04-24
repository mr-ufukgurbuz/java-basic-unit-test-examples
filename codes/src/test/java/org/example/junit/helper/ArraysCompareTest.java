package org.example.junit.helper;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ArraysCompareTest {

    // Returns true, if exists equality; otherwise, returns false
    @Test
    public void testArraySort_RandomArray() {
        int[] numbers = { 12, 3, 4, 1 };
        int[] expected = { 1, 3, 4, 12 };
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    // JUnit Excepted Exception özelliği ile beklenilen hataların oluşup oluşmadığını,
    // beklenilen hatada hangi mesajı vermesi gerektiğini tanımlarız.
    @Test(expected=NullPointerException.class)
    public void testArraySort_NullArray() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    // Returns true, if test running duration time is less than timeout; otherwise, returns false
    @Test(timeout=100)
    public void testSort_Performance(){
        int array[] = {12,23,4};
        for(int i=1;i<=1000000;i++)
        {
            array[0] = i;
            Arrays.sort(array);
        }
    }
}
