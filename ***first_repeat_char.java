Efficiently find first repeated character in a string without using any additional data structure in one traversal
Implement a space efficient algorithm to check First repeated character in a string without using any additional data structure in one traversal. Use additional data structures like count array, hash, etc is not allowed.

input: abcfdaeecfa
output: a, 5

public class StringRepeatChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "abcfdaeecfa";  
        
        
        char c =' ';
        int idx = -1;
        int len = str.length();
        int mask = 0;
        for(int i=0; i<len; i++)
        {
            c = str.charAt(i);   
            idx = c - 'a';
            
            if((mask & 1<<idx) == 0)
            {
                mask = mask | 1 <<idx;
            }
            else{
                System.out.println("character: "+ c+" index: "+i);
                break;
            }
            
        }
        
        /*
        for(int i=0; i<len-1; i++)
        {
            c = str.charAt(i);            
            if(str.indexOf(c, i+1) != -1)
            {
                idx = str.indexOf(c, i+1);
                break;
            }            
        }
*/
        
    }
    
}
