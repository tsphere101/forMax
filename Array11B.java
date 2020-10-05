import java.util.Scanner;
public class Array11B {
    public static void main(String[] args) {
        long x[] = new long[50];
        Scanner myScanner = new Scanner(System.in);
        int a = myScanner.nextInt(),b = myScanner.nextInt();
        x[0] = a; x[1] = b;
        for(int i = 2; i<= 49;i++)
        {
            x[i] = x[i-1] + x[i-2];
        }
        dispArray(x, 4);

    }
    public static void dispArray(long[] x, int n)
    {
        int k = 0;
        for(int i = 0; i < x.length ; i++ )
        {
            System.out.print(x[i] + " ");
            k = k +1;
            if(k == n) {System.out.print("\n"); k = 0;}
        }
        System.out.print("\n");
    }
}
