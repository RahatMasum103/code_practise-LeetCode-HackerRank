Given an array of characters, compress it in-place.

The length after compression must always be smaller than or equal to the original array.

Every element of the array should be a character (not int) of length 1.

After you are done modifying the input array in-place, return the new length of the array.

 
Follow up:
Could you solve it using only O(1) extra space?

 
Example 1:

Input:
["a","a","b","b","c","c","c"]

Output:
Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

Explanation:
"aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
 

Example 2:

Input:
["a"]

Output:
Return 1, and the first 1 characters of the input array should be: ["a"]

Explanation:
Nothing is replaced.
 

Example 3:

Input:
["a","b","b","b","b","b","b","b","b","b","b","b","b"]

Output:
Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].

Explanation:
Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
Notice each digit has it's own entry in the array.


class Solution {
    public int compress(char[] chars) {
     
        if(chars.length <=1) return 1;
        
        int i = 0, j = 1;
        
        int count = 1;
        String str ="";
        int lastIndex = 0;
        int len = chars.length;
        while(j < len)        {
            
            if(chars[i] == chars[j])
            {
                count++;
            }           
            else{
                if(count == 1)
                {
                    str = str + chars[i];
                }
                else{
                    str = str + chars[i] + count;  
                }             
                
                count = 1 ;                
                i = j;
                System.out.println(str);                
            }
            j++;        
                        
        }
        if(count == 1)
        {
            str = str + chars[len-1];
        }
        else{
            str = str + chars[len-1] + count;  
        }      
        
        char [] res = str.toCharArray();
        int k = 0;
        for(char c : res)
        {
            chars[k++] = c;
        }
        return res.length;
        
        
        /*
        
        HashMap<Character,Integer> hmap = new HashMap();
        
        for(char c : chars)
        {
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }
        
        //System.out.println(hmap.size());
        
        String str = "";
        
        for(char c : hmap.keySet())
        {
            int count = hmap.get(c);
            if(count==1)
            {
                str = str + c ;
            }
            else{
               str = str + c + count; 
            }
            
            //str.append(c);
            //str.append(count);
            //System.out.println(str);
        }
        
        char [] res = str.toCharArray();
        
        int i = 0;
        for(char c : res)
        {
            chars[i++] = c;
        }
        int len = res.length;
        //System.out.println(len);
        
        return len;
        */
    }
}
