import java.util.Arrays;

public class thirtyoneAnagram {
    static char[]sortchr(char[] a)
    {int count=a.length;
        char temp;
        for (int i=0;i<count;i++)
            for(int j=i+1;j<count;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        return a;
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        Boolean res=false;
        char[] achr=sortchr(a.toUpperCase().toCharArray());
        Arrays.sort(achr);
        System.out.println(Arrays.toString(achr));
        char[] bchr=sortchr(b.toUpperCase().toCharArray());
         Arrays.sort(bchr);
         System.out.println(Arrays.toString(bchr));
        if (achr.length==bchr.length)
        {
            for(int i=0;i<achr.length;i++)
            {if (achr[i]==bchr[i])
                res= true;
            else
            { res= false;
                break;}
            }
        }
        else
        { res= false;
        }

        return res;
    }

    public static void main(String[] args) {
        String a="gomathi";
       // anagramm
         //       marganaa
        System.out.println(isAnagram("anagramm","marganaa"));


    }
}
