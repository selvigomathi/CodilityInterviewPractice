import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class twenEightRemoveDuplicates {
    public static void main(String[] args) {
        String word="geeksforgeeks";
       char[] chrArr= word.toCharArray();
        Set<Character> chrSet=new HashSet<Character>();
        for (Character c:chrArr)
        {
            chrSet.add(c);
        }
        System.out.println(chrSet.toString());
    }
}
