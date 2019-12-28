import javax.swing.*;

public class SixteenTokenizer {
    public static String metod(String word, int count)
    {
        String result="";
        if (word.length()>0)
        {

        String[] wrodArr=word.split(" ");
        String temp="";
        if (wrodArr[0].length()>count)
        {

            result=wrodArr[0];
        }
        else
        {
        for (int i=0;i<wrodArr.length;i++) {
            if ((temp.length() + wrodArr[i].length() )> count) {
                result= temp;
            } else {
                temp = temp + wrodArr[i]+" ";
            }
        }

        }
        }
        else
        {
            result= " ";
        }
        return result;
    }
    public static void main(String args[])
    {
        String word="Codility We test coders";
        int count=15;
        String result=metod(word,count).trim();
        System.out.println(result);
        System.out.println(result.length());
    }
}

