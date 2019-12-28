import java.util.HashMap;
import java.util.Map;

public class ThirteenWordCoutn {
    public static void main(String args[])
    {
        String word="This this is is done by Saket Saket";
        String[] words=word.split(" ");
        Map<String,Integer>wordMp=new HashMap<String,Integer>();
        for(String s:words)
        {
            if(wordMp.containsKey(s))
            {
                wordMp.put(s,wordMp.get(s)+1);
            }
            else
            {
                wordMp.put(s,1);
            }
        }
        System.out.println(wordMp);

    }}
