/*
  The program contains the fixed array element to mention which element to find
  FOR EXAMPLE:
  SAMPLE INPUT 1:
    nums[]={1,2,3,4,5,6,7,8,9} target=8;
    output: 7
  SAMPLE INPUT 2:
    nums[]={1,2,3,4,5} target=6
    output=-1
*/



class Search
{
	public static int sear(int[] nums,int target,int middle)
	{
		int ans=nums.length;
		while(ans!=0&&middle!=-1&&middle==nums.length){
			if(nums[middle]==target){
				ans=middle;
				break;
			}
			else if(nums[middle]<target)++middle;
			else --middle;
			ans--;
		}
		if(ans==nums.length)
			ans=-1;
		return ans;
	}
	public static void main(String ar[])
	{
		int nums[]={1,5,7,8,9,12,23,45,67,89,90,99,100,122,133,144,155,166,177,188,199,199};
		int target=7;
		System.out.println(sear(nums,target,nums.length/2));
	}
}
