import java.util.TreeSet;

public class TwentyFiveTreeSEt {
        public static void main(String args[]) {
            TreeSet tr = new TreeSet();
            tr.add(12);
            tr.add(3);
            tr.add(3);
            tr.add(11);
            tr.add(5);
            System.out.println(tr);
            if (tr.contains(7))
            {
                System.out.println("hurray found the element");
            }
        }
}
