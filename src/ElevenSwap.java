public class ElevenSwap {
    public static void main(String args[])
    {
        int n=9;
        int a=10;
        System.out.println("n = "+n+" a ="+a);
        n=n+a;
        a=n-a;
        n=n-a;
        System.out.println("n = "+n+" a ="+a);
    }
}
