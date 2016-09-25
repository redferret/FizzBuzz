import fizzbuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Richard
 */
public class FizzBuzzTest {
    
    @Test
    public void fizzBuzzOutputLengthTest(){
        
        int start = 0;
        int finish = 20;
        
        String[] output = FizzBuzz.fizzBuzz(start, finish);
        
        assertNotNull("The output is null", output);
        
        Integer expectedLength = finish - start;
        Integer actualLength = output.length;
        assertEquals("Lengths don't match", expectedLength, actualLength);
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void fizzBuzzInvalidParamsRangeTest(){
        FizzBuzz.fizzBuzz(10, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void fizzBuzzInvalidParamsTest(){
        FizzBuzz.fizzBuzz(-5, 2);
    }
    
    @Test
    public void fizzBuzzTest(){
        
        int start = 0;
        int finish = 20;
        
        String[] output = FizzBuzz.fizzBuzz(start, finish);
        
        assertNotNull("The output is null", output);
        
        String expectedStr = "Fizz";
        String actualStr = output[3];
        assertEquals("Output is incorrect", expectedStr, actualStr);
        
        expectedStr = "Fizz";
        actualStr = output[3];
        assertEquals("Output is incorrect", expectedStr, actualStr);
        
        expectedStr = "Buzz";
        actualStr = output[5];
        assertEquals("Output is incorrect", expectedStr, actualStr);
        
        expectedStr = "Fizz Buzz";
        actualStr = output[15];
        assertEquals("Output is incorrect", expectedStr, actualStr);
        
        expectedStr = "1";
        actualStr = output[1];
        assertEquals("Output is incorrect", expectedStr, actualStr);
    }
    
}
