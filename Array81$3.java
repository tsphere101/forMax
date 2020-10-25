import java.util.Scanner;
public class Array81$3 {
    
    static double[] A = new double[10];
    static double[] B = new double[10];
    public static void main(String[] args)
    {
        getData();
        compute();
        for(int i = 0; i < 10 ;i ++)
        {
            System.out.println(B[i]);
        }
    }

    public static void getData()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter num : \n");
        for (int i = 0; i < 10 ; i ++)
        {
            A[i] = kb.nextDouble();
        }
    }

    public static void compute()
    {
        for(int i = 0; i < 8 ; i ++)
        {
            B[i] = A[i] + A[i+1] + A[i+2];
            B[i] /= 3.0;
        }
    }


}
