import java.util.StringTokenizer;

public class NineRemoSpaces
{
    public static void main(String[] args) {
        String word="Try    to    remove   extra   spaces.";
      StringTokenizer st=new StringTokenizer(word," ");
      StringBuffer sb=new StringBuffer();
      while(st.hasMoreTokens())
      {
          sb.append(st.nextElement());
          sb.append(" ");
      }

        System.out.println(sb);
    }
}
