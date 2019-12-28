/*public class RegexpSample {
    public static void main(String[] args) {

    }
}*/
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class  RegexpSample  {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
HashMap<String,String>hmp=new HashMap<String,String>();
List<String>ts=new ArrayList<String>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            hmp.put(emailID,firstName);

        }
        System.out.println(hmp);
        scanner.close();
        Iterator<String>hmpItr=hmp.keySet().iterator();
        while(hmpItr.hasNext())
        {
          String s=  hmpItr.next();
            if (s.contains("*gmail.com"))
                ts.add(hmp.get(s));

        }
        Collections.sort(ts);
        System.out.println(ts);



    }
}
