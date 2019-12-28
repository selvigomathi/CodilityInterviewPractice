class parent{
    public static void foo()
    {
        System.out.println("I am foo in super");
    }
    public  void par()
    {
        System.out.println("I am par in super");
    }
}
public class polymorphism extends parent {
    public static void foo()
    {
        System.out.println("I am foo in child");
    }
    public  void par()
    {
        System.out.println("I am par in child");
    }

    public static void main(String[] args) {
        parent parent=new polymorphism();
        polymorphism child=new polymorphism();
        parent.par();
        parent.foo();
        child.par();
        child.foo();
    }
}
