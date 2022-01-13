package longestSubstring;

public class LongestSubstring {
    public static void main (String[] args){
        String str = "1111123456712312311198765431111";

        System.out.println("input [" + str + "]");
        BruteForce input = new BruteForce();

        System.out.println("BruteForce version: longest substring is " 
            + input.computeLength(str) + " unique char, \"" + input.getString() + "\"") ;

        OptimizedN2 input2 = new OptimizedN2();

        System.out.println("OptimizedN2: longest substring is " 
            + input2.computeLength(str) + " unique char, \"" + input2.getString() + "\"") ;

        OptimizedLinear input3 = new OptimizedLinear();

        System.out.println("OptimizedLinear: longest substring is " 
            + input3.computeLength(str) + " unique chars, \"" + input3.getString() + "\"") ;


    }
}
