import java.util.*;

public class Triplets {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
      int testcase=  sc.nextInt();
      int target=0;
      int  triplet=0;
      for (int k=0;k<testcase;k++)
      {
          int arrSize[]=new int[sc.nextInt()];
          for (int i=0;i<arrSize.length;i++)
          {
              arrSize[i]=sc.nextInt();
          }
          Arrays.sort(arrSize);
          List<Integer>alst=new ArrayList<Integer>();
          for (int i=0;i<arrSize.length;i++)
          {
              for (int j=i+1;j<arrSize.length;j++)
              {
                  target=arrSize[i]+arrSize[j];
                  for (int l=j+1;l<arrSize.length;l++)
                  {
                 if (target==arrSize[l])
                 {
                     triplet=triplet+1;
                 }
                  }
              }
          }
      }
      if (triplet>0)
        System.out.println("triplet::"+triplet);
      else
          System.out.println("triplet::"+-1);

        */

          Scanner sc=new Scanner(System.in);
      int testcase=  sc.nextInt();

      int  triplet=0;
        int arrSize= sc.nextInt();
      for (int k=0;k<testcase;k++) {
          List<Integer> alst = new ArrayList<Integer>();
          for (int i = 0; i < arrSize; i++) {
              alst.add(sc.nextInt());
          }
          Collections.sort(alst);

          for (int i = 0; i <arrSize; i++) {
              int target=0;
              for (int j = i + 1; j < arrSize; j++) {
                  target = alst.get(i) + alst.get(j);
                  if (alst.contains(target)) {
                      triplet = triplet + 1;
                                      }
              }
          }

          if (triplet > 0)
              System.out.println( triplet);
          else
              System.out.println(-1);
      }
    }
}
//7 2 5 4 3 6 1 9 10 12