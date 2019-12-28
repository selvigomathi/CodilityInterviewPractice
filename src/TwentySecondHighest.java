import java.util.Arrays;

public class TwentySecondHighest {
    public static void main(String args[])
    {
        int arr[]={2};
        Arrays.sort(arr);
        int size=arr.length;
        if (size>1)
        {
            System.out.println(arr[size-2]);
        }
        else if (size==1)
            System.out.println(arr[0]);
    }
}
