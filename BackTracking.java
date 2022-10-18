/*
Compination the words
*/

class CompinationArray
{
    public void findPerumutation(int[] array, int currentIndex) 
    {
        if (currentIndex == array.length - 1)
        {
            for(int i=0;i<array.length;i++)
                System.out.print(array[i]+" ");
            System.out.println();
          return;  
        }

        for (int i = currentIndex; i < array.length; i++) 
        {
            if(i!=currentIndex && array[i]==array[i-1])continue;
            new CompinationArray().swapArray(array, i, currentIndex);
            findPerumutation(array, currentIndex + 1);
            new CompinationArray().swapArray(array, i, currentIndex);
        }
    }
    private void swapArray(int[] array, int i, int currentIndex) 
    {
        int temp = array[i];
        array[i] = array[currentIndex];
        array[currentIndex] = temp;
    }
    public static void main(String ar[])
    {
        int num[] = {1,1,2};
        new CompinationArray().findPerumutation( num, 0); 
    }
}
