import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class twentySixiterator {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<Integer>();
        ls.add(10);
        ls.add(20);
        ls.add(13);
        ls.add(5);
        ls.add(7);
        ls.add(6);
        System.out.println(ls);
        Iterator it=ls.iterator();
        while(it.hasNext())
        {
            Integer i=(Integer)it.next();
          if  (i%2==0)
          {
it.remove();
          }
        }
        System.out.println(ls);
    }
}
