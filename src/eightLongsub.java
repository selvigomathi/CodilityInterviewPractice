import java.util.HashSet;
import java.util.Set;

public class eightLongsub {
    //Software_Developer_In_Test
    public static void main(String arg[])
    {
        int size=0;
        String finalwrd="";
        String input="developers_write_unit_tests";//"Software_Developer_In_Test";
        String[] wordLst=input.split("_");

       for (String word:wordLst)
       {
          if (nodupliword(word))
          {
              if(size<word.length())
              {
                  size=word.length();
                  finalwrd=word;
              }
          }
       }
        System.out.println(finalwrd);

    }
   public static Boolean nodupliword(String word)
   {
       char[]chrArr=word.toCharArray();
       Set<Character>chrSet=new HashSet<Character>();
       Boolean result=false;
       for (Character c:chrArr)
       {
           if (chrSet.contains(c))
           {
             result= false;
             break;
           }else
           {
               chrSet.add(c);
               result= true;
           }
       }
return result;
   }
}
