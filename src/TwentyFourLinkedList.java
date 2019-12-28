import java.util.LinkedList;

public class TwentyFourLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("gomathi");
        ll.add(23);
        ll.add(null);
        System.out.println(ll.size());
        ll.add(0, "tharun");
        ll.set(2, "deepthi");
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);
    }
}