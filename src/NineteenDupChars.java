import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NineteenDupChars {
    public static void main(String args[])
    {
        String str = new String("Sakkett");
        char[] strchr=str.toCharArray();
        Map<Character,Integer>chrMp=new HashMap<Character,Integer>();
        for(char c:strchr )
        {
            if (chrMp.containsKey(c))
            {
                chrMp.put(c,chrMp.get(c)+1);
                System.out.println(c);

            }
            else
            {
                chrMp.put(c,1);
            }

        }
        System.out.println(chrMp);

    }
}
