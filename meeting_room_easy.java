Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.

Example 1:

Input: [[0,30],[5,10],[15,20]]
Output: false
Example 2:

Input: [[7,10],[2,4]]
Output: true

/************************************/


class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        int len = intervals.length;
        
        Arrays.sort(intervals, (a,b) -> (a[0]-b[0]));
        
        if(len<1) return true;
        
        int [] temp = intervals[0];
        
        for(int i=1; i< len; i++)
        {
            if(temp[1] > intervals[i][0]) return false;
            
            else
            {
                temp = intervals[i];
            }
            
        }
        return true;
    }
}
