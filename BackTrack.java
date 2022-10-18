/*
ALL POSIBILITIES
*/

class BackTrack
{
	java.util.List list  = new java.util.ArrayList();
	public void callCombinationProcess( int summableArray[], int target, int index )
	{
		if(target == 0 )
		{
			System.out.println(list);
			return;
		} 
		for( int i=index; i < summableArray.length; i++ )
		{
			if(index!=i && summableArray[i] == summableArray[i-1] || target<summableArray[i] )continue;
			list.add(new Integer(summableArray[i]));
			callCombinationProcess(summableArray, target - summableArray[i],i+1);
			list.remove(new Integer(summableArray[i]));
		}
	}
	public static void main(String ar[])
	{
		int summableArray[] = {0,1,2,3,4,5,6};
		int target=8;
		new BackTrack().callCombinationProcess( summableArray, target, 0 );
	}
}
