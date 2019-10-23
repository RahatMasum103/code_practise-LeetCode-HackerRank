Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

Example 1:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".
Example 2:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["KFC", "Shogun", "Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).


/************************************************************************************************************/


class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        //HashMap<String,List<Integer>> hmap = new HashMap<>();
        
        HashMap<String,Integer> hmap = new HashMap<>();
        
        for(int i=0; i<list1.length; i++)
        {
            //List<Integer> val = 
            //hmap.put(list1[i],new ArrayList<>(i));
            hmap.put(list1[i],i);
        }
        
        System.out.print(hmap.size());
        
        HashMap<String,Integer> hmap2 = new HashMap<>();
        
        for(int i=0; i<list2.length; i++)
        {
            String s = list2[i];
            if(hmap.containsKey(s))
            {
                hmap2.put(s,hmap.get(s)+i);
            }
        }
        
        int min = Integer.MAX_VALUE;
        //int sum = 0;
        
        List<String> result = new ArrayList<>();
        for(String s : hmap2.keySet())
        {
            int min_idx = hmap2.get(s);
            if(min_idx<min)
            {
                result.clear();
                result.add(s);
                min = min_idx;
            }
            else if(min_idx == min)
            {
                result.add(s);
            }
        }
        String[] str = result.stream().toArray(String[] ::new);
        return str;
    }
}
