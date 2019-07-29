
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

/*******************************************************/

class Solution {
    public static HashMap<String, Integer>  roman_map = new HashMap<String, Integer>();    
    public static final int HASH_SZ=7;
    
    public int romanToInt(String s) {       

        roman_map.put("I",1);
        roman_map.put("V",5);
        roman_map.put("X",10);
        roman_map.put("L",50);
        roman_map.put("C",100);
        roman_map.put("D",500);
        roman_map.put("M",1000);
        
        /*
        Set mapSet = roman_map.entrySet();
        Iterator mapIter = mapSet.iterator();
        System.out.println("Hash map key:value");
        while(mapIter.hasNext())
        {
            Map.Entry mapEntry = (Map.Entry)mapIter.next();
            System.out.println(mapEntry.getKey()+" : "+mapEntry.getValue());
        }
        
        //System.out.println("Hash map key:value");
        //System.out.println(roman_map.keySet());
        //System.out.println(roman_map.values());
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Roman Number:");
        String s = sc.nextLine(); 
        
        */
        int sum=0;
        int input_sz = s.length();        
        for(int i=0; i<input_sz; i++)
        {
            String key1= Character.toString(s.charAt(i));
            int n1 = roman_map.get(key1);
            if((i+1)<input_sz)
            {
                
                String key2 =Character.toString(s.charAt(i+1));                
                int n2 = roman_map.get(key2);
                
                if(n1>=n2)
                {
                    sum+=n1;
                }
                else{
                    sum = sum + n2 -n1;
                    i++;
                }            
            }  
            else{
                sum+=n1;
                i++;
            }  
        }
        
        
        /*
        String c [] = new String[input_sz];
        for(int i=0; i<input_sz; i++)
        {
            c[i] =Character.toString(x.charAt(i)); 
            System.out.println(roman_map.get(c[i]));
        }
        
        System.out.println("Entered: "+s.toString());
        System.out.println("Number: "+sum);
        */
        
        return sum;
        
    }
}
