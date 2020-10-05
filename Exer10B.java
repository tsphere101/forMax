import java.util.Scanner;
class Exer10B 
{
    public static void main(String[] ags) {
        System.out.println("Enter 3 values separated by space to calculate a^k % n");
        System.out.println("(enter -1 to exit the program)");
        Scanner n = new Scanner(System.in);
        int r[] = {1,1,1};
        boolean flagBreak = false;
        while (true) {
        for(int i = 0; i< 3;i++)
        {
            r[i] = n.nextInt();
            if(r[0] == -1) {flagBreak = true;break;}
        }
        if (flagBreak == true) break;
        System.out.println("RESULT: " + remainder(r[0],r[1],r[2]));
        } 
    }
    public static int remainder(int a, int k, int n) {
        int r = a%n;
        for (int i = 0; i < k-1; i++) {
            r = r*a % n;
        }
        return r;
    }
}