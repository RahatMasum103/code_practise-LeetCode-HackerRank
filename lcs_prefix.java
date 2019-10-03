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
        
        String lcp = "";
        
        if(size == 0) return lcp;
        
        int pos = 0;
        String start = strs[0];
        for (char c: start.toCharArray())
        {
            for(int i=1; i<size; i++)
            {
                if(pos >= strs[i].length() || c != strs[i].charAt(pos) )
                {
                    return lcp;
                }                
            }
            lcp += c;
            pos++;
        }
        return lcp;
        
        
        
/*
        if(size == 0) return "";
        
        String lcp = strs[0];
        System.out.println("debug0... "+lcp);
        
        
        for(int i=1; i<size; i++)
        {
            //System.out.println("debug... "+strs[i].indexOf(lcp));
            //System.out.println("debug before ... "+lcp);
            while(strs[i].indexOf(lcp) !=0)
            {
                lcp = lcp.substring(0,lcp.length()-1); //inclusive, exclusive
                System.out.println("debug i... "+lcp);
                if(lcp.isEmpty()) return "";
            }
        }
        
        return lcp;
        
        /*
		Arrays.sort(strs); 		// sort arays as longest match
		

		 find the minimum length from first and last string 
		int difference = Math.min(strs[0].length(), strs[size-1].length()); 

		 find the common prefix between the first and last string 
		int i = 0; 
		while (i < difference && strs[0].charAt(i) == strs[size-1].charAt(i)) 
			i++; 

		String lcs = strs[0].substring(0, i); 
		//System.out.println(lcs);
        */
        //return lcs;
    }
}
