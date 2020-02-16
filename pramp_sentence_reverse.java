


class Solution {
  
  static void reverse(char[] arr, int start, int end){
    
    while(start<end)
    {
      char temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
Sentence Reverse
You are given an array of characters arr that consists of sequences of characters separated by space characters. Each space-delimited sequence of characters defines a word.

Implement a function reverseWords that reverses the order of the words in the array in the most efficient manner.

Explain your solution and analyze its time and space complexities.

Example:

input:  arr = [ 'p', 'e', 'r', 'f', 'e', 'c', 't', '  ',
                'm', 'a', 'k', 'e', 's', '  ',
                'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' ]

output: [ 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e', '  ',
          'm', 'a', 'k', 'e', 's', '  ',
          'p', 'e', 'r', 'f', 'e', 'c', 't' ]
          
          
          
  static char[] reverseWords(char[] arr) {
    // your code goes here
    int a=0;
    int j = arr.length-1;    
    reverse(arr, a, j);
    
    int index = -1;
    for(int i=0; i<arr.length; i++)
    {
      char c = arr[i]; 
      if(index >=0 && c == ' ')
      {
        reverse(arr, index, i-1);
        index = -1;        
      }
      else if (index >=0 && i == arr.length -1)
      {
        reverse(arr, index, i);
      }
      else if(index == -1)
      {
        index = i;
      }
    }  
    
    return arr;   
    
  }
