import java.util.*;
public class ThirtyTwoDuplicate
{
    public static void main(String args[])
    {
        String str="I am am learning java learning java";
        StringBuffer sbr=new StringBuffer(str);
        sbr.reverse();
        System.out.println("reverse ::"+sbr);
        String[] sarr=str.split(" ");
        StringBuffer sb=new StringBuffer();
      Map<String,Integer>hmp=new HashMap<String,Integer>();
      //  Set<String>strSet=new HashSet<String>();
        for(String s:sarr)
        {
            if(hmp.containsKey(s))
            {
                hmp.put(s,hmp.get(s)+1);
                System.out.println(s);
            }
            else
                sb.append(s);
                 hmp.put(s,1);
        }
        System.out.println(hmp);
        System.out.println(sb);

    }
}