Input Format

A single line of input containing the space separated month, day and year, respectively, in    format.

Constraints

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015
Sample Output

WEDNESDAY

/**************************************/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
   
                String dateString = String.format("%d-%d-%d", year, month, day);
                Date date = null;
                try {
                     date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
                }
                catch(ParseException ref){
                    ref.printStackTrace();
                }  
            
                // Then get the day of week from the Date based on specific locale.
                String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
                
                return dayOfWeek.toUpperCase();
    }

}

public class Solution {
