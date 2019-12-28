import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSortLstString {
    public static void main(String[] args) {
        String[] strLst={ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "aug", "Sep", "Oct", "nov", "Dec" };
        List<String> strlst= Arrays.asList(strLst);
        Collections.sort(strlst);
        System.out.println(strlst);
        testSort(strLst);
    }
    public static  void testSort(String[] strLst)
    {
        Arrays.sort(strLst);
        for (String s:strLst)
        {
            System.out.println(s);
        }

    }
}
