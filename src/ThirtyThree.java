import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThirtyThree {
    //Printing in Descending Order
    public static void main(String[] args) {
        List<Integer>intLst=new ArrayList<Integer>();
        intLst.add(10);
        intLst.add(10);
        intLst.add(8);
        intLst.add(25);
        intLst.add(20);

        Collections.sort(intLst);
        for(Integer j:intLst)
        {
            System.out.println(j);
        }
        Comparator cmp= Collections.reverseOrder();
        Collections.sort(intLst,cmp);
        for(Integer i:intLst)
        {
            System.out.println(i);
        }
    }
}
