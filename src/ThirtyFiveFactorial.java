public class ThirtyFiveFactorial {
   public static int facct(int n)
   {
       if(n==1)
       {
           return 1;
       }
       else return n*facct(n-1);
   }
    public static void main(String[] args) {
       int n=5;
        System.out.println( facct(n));
    }
}
