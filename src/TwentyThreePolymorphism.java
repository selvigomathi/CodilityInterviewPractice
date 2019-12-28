abstract class sample
        {
          abstract public void methodPoly();
        }
public class TwentyThreePolymorphism extends sample {
    public void methodPoly()
    {
        System.out.println("no parameters");
    }
    public void metodPoly(int a,int j)
    {
        System.out.println("two parameters");
    }
    public static void main(String[] args) {
        TwentyThreePolymorphism obj=new TwentyThreePolymorphism();
        obj.methodPoly();
        obj.metodPoly(10,20);

    }
}
