public class twelveThreeReverseString {
    public static void reverseOne(String word)
    {
        StringBuffer sb=new StringBuffer(word);
        sb.reverse();
        System.out.println("reverseOne"+sb);

    }
    public static void reverseTwo(String word)
    {

        StringBuilder sbd=new StringBuilder(word);
        sbd.reverse();
        System.out.println("reverseTwo "+sbd);

    }
    public static void reverseThree(String word)
    {
        String s="";
        char[] chrarr=word.toCharArray();
        for (int i=chrarr.length-1;i>=0;i--)
        {
            s=s+chrarr[i];
                    }
        System.out.println("reverseThree "+s);
    }
    public static void main(String[] args) {
        String word="gomathi";
        reverseOne(word);
        reverseTwo(word);
        reverseThree(word);
    }
}
