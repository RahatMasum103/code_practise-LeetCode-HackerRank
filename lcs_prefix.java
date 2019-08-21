Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

/********************************************************************/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;

		Arrays.sort(strs); 		// sort arays as longest match
		

		/* find the minimum length from first and last string */
		int difference = Math.min(strs[0].length(), strs[size-1].length()); 

		/* find the common prefix between the first and 
	           last string */
		int i = 0; 
		while (i < difference && strs[0].charAt(i) == strs[size-1].charAt(i)) 
			i++; 

		String lcs = strs[0].substring(0, i); 
		//System.out.println(lcs);
        return lcs;
    }
}
