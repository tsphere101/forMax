
import java.util.Scanner;

public class Exer10C {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String word = "";
        while (word != null)
        {
            word = myScanner.nextLine();
            if(palindromes(word)) System.out.print("Yes, it is palindrome\n"); else System.out.print("No.\n");
        }
        myScanner.close();


    }
    public static boolean palindromes(String wd)
    {
        String A = "";
        for (int i = wd.length()-1; i >= 0; i--)
        {
            A = A + wd.charAt(i);
        }
        if (A.equals(wd)) return true; else return false;
    }
}
