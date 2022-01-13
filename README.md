# longestSubstring
 
created three different versions of a program that finds the longest unique substring from the main.  
1. Brute Force 
2. Optimized to O(n^2)
3. Optimized to O(n)

Brute Force has 3 nested loops where it checks every single substring
optimized n^2 gets rid of one of the nested loops by not checking any of the substrings shorter than the current max length
Optimized linear gets rid of another nested loop by instead of going through all substrings that could be longer, by
  moving the starting char over to not include the first instance of the duplicate char and skipping all substrings inbetween.
  
I have commented each section of the code to highlight my thought process but to be honest, the hardest part of this exercise
was figuring out how to properly document the substrings without adding to the time complexity.  Because of this, I wasn't able to 
get the optimized versions to match the substring found in the brute force version.  While I could make the brute force version
match the others fairly easy, I feel it kind of highlights how the code works differently between Brute Force and the others.

Let me know what you think, maybe I still made it more difficult than what it could be but I can't think of anyway to get it better 
than linear.
