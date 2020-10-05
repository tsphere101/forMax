public class Array11A {
    public static void main (String[] args)
    {
        int X[] = {10,20,30,40,50,60},Y[] = {10,20,40,30,60,50},Z[] = {10,20,30,40,50,60};
        //check X & Y 
        if(equalArrays(X, Y)) System.out.print("X is equals Y\n"); else System.out.print("X is not equals Y\n");
        //check X & Z
        if(equalArrays(X, Z)) System.out.print("X is equals Z\n"); else System.out.print("X is not equals Z\n");
    }

    public static boolean equalArrays(int[] A, int[] B)
    {
        for(int i = 0; i< A.length ; i++)
        {
            if (A[i] != B[i]) return false;
        }
        return true;
    }
}
