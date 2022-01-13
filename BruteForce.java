package longestSubstring;

//time complexity O^3 because it has 3 nested loops
public class BruteForce {
    private String subString;

    public BruteForce(){
        subString = "";
    }

    public int computeLength(String str){
        //local variable for resulting substring length and original string length
        int result = 0;
        int len = str.length();

        //i is starting letter of substring, j is ending letter of substring
        for(int i=0; i < len; i++){
            for(int j=0; j < len; j++){
                //test to see if all char inbetween are unique char, returns boolean value
                if(unique(str, i, j)){
                    //compares length of current substring to current longest substring
                    result = Math.max(result, j-i+1);
                }
            }
        }

        return result;
    }

    private boolean unique(String str, int first, int last){
        //create array of int values for all 128 ascii chars
        int[] ascii = new int[128];
        //checks each char from first to last and increments the associated
        //char value index position for whichever char is there.
        for(int i = first; i <= last; i++){
            char c = str.charAt(i);
            ascii[c]++;
            //any index with a value greater than 1 has a repeated char and is not unique
            if(ascii[c] > 1){
                return false;
            }
        }
        //documents the longest substring within the BruteForce object.  Have to add one to account
        //for 0 index position
        if(subString.length() <= last-first+1){
            subString = str.substring(first, last+1);
        }
        return true;
    }

    //sends the substring to main
    public String getString(){
        return subString;
    }
}
