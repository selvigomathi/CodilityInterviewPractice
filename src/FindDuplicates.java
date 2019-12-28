import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,4,6,7,7,8,91};
        List<Integer> orgLst=new ArrayList<Integer>(Arrays.asList(a ));
        Set<Integer> orgset=new HashSet<Integer>();
        for(Integer intval:orgLst) {
            if (orgset.contains(intval))
        {
            System.out.println(intval);
        }else
            {
                orgset.add(intval);
            }
        }
        method2(a);
    }
    public static void method2(Integer[] a)
    {
      for  (int i=0;i<a.length;i++)
      {
          for (int j=0;j<a.length;j++)
              if (i!=j){
           if (a[i]==a[j])
               System.out.println(a[j]);
      }
      }
    }
}
