package longestSubstring;

public class OptimizedLinear {
    private String subString = "";

    //time complexity of 2xn because even though there are two nested loops
    //the second loop only runs till it only has 1 instance of each char rather
    //than checking all substrings inbetween, it skips all chars till it gets rid
    //of the repeated char making it linear rather than exponetial 
    public int computeLength(String str){
        //result is max length of substring, subStringLength is length of previous longest string
        int result = 0, subStringLength = 0;
        //starting char to check, ending char to check
        int start = 0, end = 0;
        //keeps track of where in the string to find longest unique substring
        int lastCharIndex = 0;
        //array of char instances
        int[] checkedChars = new int[128];

        //first loop checks every char from beginning to end of string
        while(end < str.length()){
            //increments in char array which char has been checked.
            char e = str.charAt(end);
            checkedChars[e]++;

            //when the current char has more than one instances, it moves start over 
            //to delete the first instance of the char so it would never run n^2
            while(checkedChars[e] > 1){
                //decrements first char till it finds duplicate 
                char s = str.charAt(start);
                checkedChars[s]--;
                //moves start position over in the string
                start++;
            }
            //compares result to current unique string
            result = Math.max(result, end-start+1);
            //if result is now longer than the previous longest substring it updates where
            //and how long.
            if(subStringLength < result){
                lastCharIndex = end+1;
                subStringLength++;
            }
            //moves end position over in string
            end++;
        }
        //after the end of the string is reached, substring is documented.
        subString = str.substring(lastCharIndex - result, lastCharIndex);
        return result;
    }

    public String getString(){
        return subString;
    }
}
