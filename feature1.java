import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

// file for feature-1
// feature 1 takes an array and sorts it
public class feature1{
    public static void main(String[] args){

         int arr[] = {3, 2, 5, 8, 11, 1, 0, 100};

        // function call
        sortArray(arr);
    }

    // function to sort the array
    public static int[] sortArray(int[] arr){
        System.out.println("Array before sorting: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Array after sorting: " + Arrays.toString(arr));

        return arr;
    }

        // Test function to test the above method
        @Test
        public void testsortArray(){
            assertArrayEquals(new int[] {1, 2, 3, 4, 5}, sortArray(new int [] {3, 4, 5, 2, 1}));  // test-case 1
            assertArrayEquals(new int[] {'a', 'g', 'm', 'p', 'q', 'x', 'z'}, sortArray(new int [] {'x', 'p', 'z', 'a', 'q', 'g', 'm'}));  // test-case 2
            assertArrayEquals(new int[] {8, 14, 55, 77, 101}, sortArray(new int [] {77, 55, 101, 8, 14}));  // test-case 3

        }
   

    
}

