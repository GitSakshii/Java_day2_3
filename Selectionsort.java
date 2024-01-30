import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }

      int minidx;
       for(int i=0;i<n-1;i++)
       {
           minidx=i;
           for(int j=i+1;j<n;j++)
           {
               if(arr[j]<arr[minidx]){minidx=j;}
           }
           if(minidx!=i) {
               int tmp = arr[minidx];

               arr[minidx] = arr[i];
               arr[i] = tmp;
           }
       }

       for(int i=0;i<n;i++)
       {
           System.out.print(arr[i]+" ");
       }
    }
}
