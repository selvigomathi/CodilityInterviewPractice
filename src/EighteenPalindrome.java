import java.util.Scanner;

public class EighteenPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer sb=new StringBuffer(A);
        sb.reverse();
        if (A.equals(sb.toString()))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */
    }
}
