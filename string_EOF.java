Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankcode;

import java.util.Scanner;

/**
 *
 * @author APU
 */
public class JavaEOF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);        
        int lineCount =0;
        while(sc.hasNext())
        {
            String str = sc.nextLine();  
            System.out.println((++lineCount)+ " "+ str);
                      
        }
        sc.close();
    }
    
}
