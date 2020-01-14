/*


Function Description

Complete the function compareTriplets in the editor below. It must return an array of two integers, the first being Alice's score and the second being Bob's.

compareTriplets has the following parameter(s):

a: an array of integers representing Alice's challenge rating
b: an array of integers representing Bob's challenge rating
Input Format

The first line contains  space-separated integers, , , and , describing the respective values in triplet .
The second line contains  space-separated integers, , , and , describing the respective values in triplet .

Constraints

Output Format

Return an array of two integers denoting the respective comparison points earned by Alice and Bob.

Sample Input 0

5 6 7
3 6 10
Sample Output 0

1 1

*/

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

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int scoreA = 0;
        int scoreB = 0;

        List<Integer> result = new ArrayList<>();

        for(int i=0; i<a.size(); i++)
        {
            int numA = a.get(i);
            int numB = b.get(i);

            if(numA>numB)
            {
                scoreA++;
            }
            else if(numB>numA)
            {
                scoreB++;
            }
        }
        result.add(scoreA);
        result.add(scoreB);

        return result;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
