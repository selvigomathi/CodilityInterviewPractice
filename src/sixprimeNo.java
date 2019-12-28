public class sixprimeNo {
    public static void main(String args[])
    {
        int num=27;
        Boolean prime=false;
        for (int i=2;i<num+1/2;i++)
        {
            if (num%i==0)
            {
                prime=false;
                System.out.println("not a prime number");
                break;
            }
            else
            {
                prime=true;
            }

        }
        System.out.println(prime);
    }
}
