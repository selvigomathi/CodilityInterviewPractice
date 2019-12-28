import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeventeenCodility {
    public static void main(String[] args) {

        String word="Codility We test coders";
        int count=15;
        String cutWord=word.substring(0,count);
        String[] cutWords= cutWord.split(" ");
        String[]words=word.split(" ");
        List<String> orilst=new ArrayList<String>(Arrays.asList(words));
        List<String>relst=new ArrayList<String>(Arrays.asList(cutWords));
        relst.retainAll(orilst);
        String temp=" ";
        for (String t:relst)
        {
            temp=temp+t+" ";
        }

        System.out.println(temp.trim());

    }
}

