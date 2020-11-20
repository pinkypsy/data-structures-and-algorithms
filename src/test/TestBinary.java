package test;

import org.junit.Before;
import org.junit.Test;
import ua.alvin.search.BinarySearchIterativeAndRecursive;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class TestBinary {

    BinarySearchIterativeAndRecursive classToCheck = new BinarySearchIterativeAndRecursive();
    int[] array = new int[]{-22, -15, 1, 7, 20, 35, 55};

    @Test
    public void checkBinaryIter() {

         assertEquals(2,classToCheck.iterativeBinarySearch(array,1));
         assertEquals(0,classToCheck.iterativeBinarySearch(array,-22));
         assertEquals(1,classToCheck.iterativeBinarySearch(array,-15));
         assertEquals(6,classToCheck.iterativeBinarySearch(array,55));
         assertEquals(-3,classToCheck.iterativeBinarySearch(array,0));
         assertEquals(-1,classToCheck.iterativeBinarySearch(array,-25));
    }

    @Test
    public void checkBinaryRecur() {
        assertEquals(2,classToCheck.recursiveBinarySearch(1,array, 0, array.length));
        assertEquals(0,classToCheck.recursiveBinarySearch(-22,array, 0, array.length));
        assertEquals(1,classToCheck.recursiveBinarySearch(-15,array, 0, array.length));
        assertEquals(6,classToCheck.recursiveBinarySearch(55,array, 0, array.length));
        assertEquals(-3,classToCheck.recursiveBinarySearch(0,array, 0, array.length));
        assertEquals(-1,classToCheck.recursiveBinarySearch(-25,array, 0, array.length));
    }


}
