import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FourteenLoopHashMap {
    public static void main(String args[])
    {
        Map<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("Gomathi",1000);
        hm.put("tharun",2000);
        hm.put("deepthi",3000);
        hm.put("sankar",4000);
        for(Map.Entry<String,Integer> ent:hm.entrySet())
        {
            System.out.println(ent.getKey());
            System.out.println(ent.getValue());
        }
        Iterator  setint=hm.entrySet().iterator();
        while(setint.hasNext())
        {
            System.out.println(setint.next());
        }
            }
}
