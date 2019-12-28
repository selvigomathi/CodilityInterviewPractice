import java.util.Scanner;

public class FourReverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String original=sc.nextLine();
        StringBuilder sb=new StringBuilder(original);
        sb.reverse();
        System.out.println(sb);
secondrevers(original);
        thirdrevers(original);

    }
    public static void secondrevers(String original)
    {
        String temp="";

        char[] chrArr=original.toCharArray();
        for (int i=chrArr.length-1;i>=0;i--)
        {
            temp=temp+chrArr[i];
        }
        System.out.println(temp);
    }
    public static void thirdrevers(String original)
    {
        String temp=" ";
        StringBuffer sbf=new StringBuffer(original);
        sbf.reverse();
        System.out.println(sbf);
    }

}

