public class TenPalindrome {
    public static void main(String args[])
    {
        int num=11211;
        int temp=num;
        int a,reverse=0;
        while(temp>0)
        {
            a=temp%10;
            reverse=reverse*10+a;
            temp=temp/10;
        }
        if (reverse==num)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }

    }
}
