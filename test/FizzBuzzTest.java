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
        
        testCase("Fizz", output[3]);
        testCase("Buzz", output[5]);
        testCase("Fizz Buzz", output[15]);
        testCase("1", output[1]);
        
    }
    
    @Test
    public void fizzBuzzOffsetRangeTest(){
        
        int start = 10;
        int finish = 20;
        
        String[] output = FizzBuzz.fizzBuzz(start, finish);
        
        assertNotNull("The output is null", output);
        
        testCase("Buzz", output[0]);
        testCase("Fizz Buzz", output[5]);
        testCase("16", output[6]);
        testCase("17", output[7]);
        
    }
    
    private void testCase(String expectedStr, String actualStr){
        assertEquals("Output is incorrect", expectedStr, actualStr);
    }
    
}
