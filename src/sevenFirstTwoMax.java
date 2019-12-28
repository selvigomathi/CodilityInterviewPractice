public class sevenFirstTwoMax {
    public static void main(String args[])
    {
        int a[]={2,4,5,7,12,8,30};
        int first=0;
        int second=0;
        for (int i=0;i<a.length;i++)
        {
            if (a[i]>first)
            {
                second=first;
                first=a[i];

            }
            else
                if (a[i]>second)
                {
                    second=a[i];
                }
        }
        System.out.println("first ::  "+first+"  second :: "+second);
    }
}
