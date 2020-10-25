
 class Array81$2 
{
    public static void main( String[] args)
    {
        int test[] = {10,15,13,50,40,8};
        printReversedArray(test);
        System.out.println("");
        printAccumulation(test);
        
    }

    public static void printReversedArray(int [] arr)
    {
        for(int i = arr.length - 1 ; i >=0 ; i--)
        {
            System.out.print(arr[i] + " " );
        }
    }

    public static void printAccumulation(int [] arr)
    {
        int accum = 0;
        for(int i = 0 ; i < arr.length; i ++)
        {
            accum = accum + arr[i];
            System.out.print(arr[i] + " " + accum);
            System.out.print("\n");
        }
    }

    
}