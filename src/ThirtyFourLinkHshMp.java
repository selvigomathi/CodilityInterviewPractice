import java.util.LinkedHashMap;
import java.util.Scanner;

public class ThirtyFourLinkHshMp {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String var=  sc.nextLine();
        char[] chrLst=var.toCharArray();
        LinkedHashMap<Character,Integer> lnkChr=new LinkedHashMap<>();
        for (char c:chrLst)
        {
           if(lnkChr.containsKey(c))
           {
               lnkChr.put(c,lnkChr.get(c)+1);
           }
           else
           {
               lnkChr.put(c,1);
           }
        }
        System.out.println(lnkChr);


    }

}
