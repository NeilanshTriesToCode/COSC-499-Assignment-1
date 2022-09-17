// import java.util.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class feature2{
    public static void main(String[] args){

        int d = 2;

        System.out.println("After pi() is called: " + pi(d));
    }

    public static int pi(int num){
        return ((int) 3.14 * num);
    }
  
    // Test function to test the above method
    @Test
    public void testPi(){
      assertEquals(9, pi(3));  // test-case 1
      assertEquals(12, pi(4));  // test-case 2
      assertEquals(27, pi(9));  // test-case 3
    }
    
}


