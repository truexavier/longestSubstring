package longestSubstring;

public class OptimizedN2 {
    private String subString = "";

    //time complexity O^2 because it gets rid of one of the nested loops
    public int computeLength(String str){
        //max is original string length
        int max = str.length();
        //result is longest substring value, start and end need to be
        //kept in separate values to document proper substring value 
        //cannot track substring the same way as BruteForce because we aren't
        //checking every substring, only bigger substrings.
        int result = 0, start = 0, end = 0;
        //keeps track of most current longest substring
        String tempString = "";

        //i = start char, j = end char
        for(int i = 0; i < max; i++){
            //creates a boolean array of chars already checked and initializes
            //all values to false.
            boolean[] checkedChars = new boolean[128];
            for(int j = i; j < max; j++){
                //if the current char has already been found, it moves the window 
                if(checkedChars[str.charAt(j)] == true){
                    //resets the tempString if its found a larger substring.
                    if(tempString.length() < result){
                        tempString = "";
                    }
                    break;
                }
                //if the current char is unique, it marks the boolean index position as true.
                else{
                    //compares current result to newest unique substring length 
                    result = Math.max(result, j-i+1);
                    checkedChars[str.charAt(j)] = true;
                    //if the unique tempString length has grown, it adds the new char and documents
                    //the start and end char positions.
                    if(tempString.length() < result){
                        tempString += str.charAt(j);
                        start = i;
                        end = j+1;
                    }
                }
            }
            //sets starting char back to false to check next substring since it 
            //was part of the previous substring.
            checkedChars[str.charAt(i)] = false;
        }
        //sets the longest unique substring values found from start to end.
        subString = str.substring(start, end);
        return result;
    }

    //sends unique substring to main
    public String getString(){
        return subString;
    }

}

