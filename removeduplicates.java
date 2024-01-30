import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of an array");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

        int k=0;
        System.out.print(arr[0]+" ");
        for(int i=1;i<n;i++)
        {
           if(arr[i]!=arr[k])
           {
               k++;
               arr[k]=arr[i];
               System.out.print(arr[k]+" ");
           }
        }

    }
}
