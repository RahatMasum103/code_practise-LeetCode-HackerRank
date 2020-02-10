Given an array of integers nums, sort the array in ascending order.

 

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]



class Solution {
    public List<Integer> sortArray(int[] nums) {
        /* Quick sort */
        int low = 0;
        int high = nums.length - 1;
        
        quickSort(nums,low, high);
        
        /* bubble sort */
        /*
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=0; j<nums.length-i- 1; j++)
            {
                if(nums[j] > nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        */
        return Arrays.stream(nums).boxed().collect(Collectors.toList());
    }
    
    private void quickSort(int [] arr, int low, int high)
    {
        if(low < high)
        {
            int part = partition(arr, low, high);
            
            quickSort(arr, low, part-1);
            quickSort(arr, part+1, high);
        }
    }
    
    private int partition(int [] arr, int low, int high)
    {
        int i = low -1;
        int pivot = arr[high];
        
        for(int j = low; j<high; j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }            
        }
        
        int last = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = last;
        
        return i+1;
    }
}
