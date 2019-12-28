import java.util.HashMap;
import java.util.Map;

public class TwentyTwoSumTwo {
    public static void usingHashMap(int[] num,int target )
    {
        Map<Integer,Integer>hmp=new HashMap<Integer,Integer>();
        for (int i=0;i<num.length-1;i++)

        {
            int complement=target-num[i];
        if (hmp.containsKey(complement))
        {
         //   System.out.println(  hmp.get(complement));
            System.out.println("num[i]"+num[i]+complement) ;
        }
        else
        {
            hmp.put(num[i],i);
        }
          }
    }
    public static void main(String args[])
    {
        int num[]={4, 2, 7, 11, 15};
        int target=15;


        for (int i=0;i<num.length-1;i++)
        {
            for (int j=i+1;j<num.length-1;j++)
            {
                if(num[i]+num[j]==target)
                {
                    System.out.println(num[i]+" "+num[j]);
                }
            }
        }
        usingHashMap(num,target);

    }
}
