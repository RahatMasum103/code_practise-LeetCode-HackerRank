Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.

/************************************************/


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        
        HashMap<String, List<String>> hmap = new HashMap<>();
        
        for(String s : strs)
        {
            char [] c = s.toCharArray();
            //System.out.println(s);
            Arrays.sort(c);
            String sortedStr = new String(c);
            
            //System.out.println(sortedStr);
            
            if(!hmap.containsKey(sortedStr)){
                hmap.put(sortedStr, new ArrayList<>());                
            }
            hmap.get(sortedStr).add(s);      
            
            
        }
        result.addAll(hmap.values());
        
        return result;
    }
}
