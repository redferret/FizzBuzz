
package fizzbuzz;

/**
 *
 * @author Richard
 */
public class FizzBuzz {

    /**
     * Constructs the output array of Strings based on the classic FizzBuzz 
     * game. If the number is divisible by 3 the output will be 'Fizz', 
     * if divisible by 5, print "Buzz", if divisible by both 3 and 5 print
     * 'Fizz Buzz' otherwise print the number.
     * @param start The number to start the game at
     * @param finish The number to finish the game at
     * @return The strings for each number from 'start' to 'finish'. The
     * length of the array is (finish - start).
     */
    public static String[] fizzBuzz(int start, int finish){
        
        int length = finish - start;
        String[] output = new String[length];
        
        for (int i = start; i < finish; i++){
            
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;
            
            if (divBy3 && divBy5){
                output[i] = "Fizz Buzz";
            }else if (divBy3){
                output[i] = "Fizz";
            }else if (divBy5){
                output[i] = "Buzz";
            }else{
                output[i] = Integer.toString(i);
            }
            
        }
        
        return output;
    }
    
}
