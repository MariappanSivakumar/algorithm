/*
Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
*/

class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length,returnvalue=0;
        int mid=0,zip=0;
        for(int i=0;i<nums.length;i++)
        {
            mid=(low+high)/2;
            if(mid<nums.length&&nums[mid]==target)
            {
                zip=1;
                returnvalue=nums[mid];
                break;
            }
            if(mid<nums.length&&nums[mid]<target)low=mid+1;
            else high=mid-1;
        }
        if(zip==0)
            mid=-1;
        return mid;
    }
}
