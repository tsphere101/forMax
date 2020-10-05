import java.util.Scanner;

public class Exer10A {
    public static void main(String[] args) {

        int input;
        Scanner n = new Scanner(System.in);
        input = n.nextInt();
        triBox(input);
    }

    public static void triBox(int n)
    {
        for(int i = 0; i < n;i++)
        {
            for(int j = 0; j <= i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
