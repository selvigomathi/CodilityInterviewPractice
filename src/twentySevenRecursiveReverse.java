public class twentySevenRecursiveReverse {
   public static void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            System.out.println( str.substring(0,str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
    public static void main(String[] args) {

        /* Function to print reverse of the passed string */
            String str = "Geeks";
         //   twentySevenRecursiveReverse obj = new twentySevenRecursiveReverse();
            reverse(str);
        }
    }


