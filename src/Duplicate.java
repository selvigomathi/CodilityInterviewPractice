import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String args[])
    {
        String a="i am testing for for duplicates";
        String[] b=a.split(" ");
        Set<String>setex=new HashSet<String>();
        StringBuffer sb=new StringBuffer();
        for (String temp:b)
        {
            if(setex.contains(temp)) {
                System.out.println(temp);
                sb.append(temp);
            }
            else
                setex.add(temp);
        }
        System.out.println(sb);
        System.out.println("setex:"+setex);
    }
}
