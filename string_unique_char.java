Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

/*****************************************************************/

class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        HashMap<Character,Integer> hmap = new HashMap<>();
        
        for(int i=0; i<len; i++)
        {
            char c = s.charAt(i);
            if(hmap.containsKey(c))
            {
                hmap.put(c,-1);
            }
            else{
                hmap.put(c,i);
            }
        }
        
        int idx = Integer.MAX_VALUE;
        for(char c: hmap.keySet())
        {
            if(hmap.get(c)>-1)
            {
                idx=Math.min(idx,hmap.get(c));
            }
        }
        
        if(idx>len) return -1;
        else return idx;
        
        
    }
}
