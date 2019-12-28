public class fiveReverseNo {
    public static void main(String args[])
    {
        int num=234;
        int temp=num;
        int rev=0;
        int a,b;
        while (temp>0)
        {
            a=temp%10;
            rev=rev*10+a;
            temp=temp/10;
        }
        System.out.println(rev);

    }}

