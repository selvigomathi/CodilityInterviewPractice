
import java.util.*;
public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2)
    {
          Set<String>setSam=new HashSet<String>();
        for(String s:names1)
        {
            setSam.add(s);
        }
        for(String t:names2)
        {
            setSam.add(t);
        }

        String[]si=new String[setSam.size()];
        int count=0;
        for (String t:setSam) {
            si[count] = t;
            count++;
        }
        return si;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}