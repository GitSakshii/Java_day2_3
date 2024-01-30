import java.util.Scanner;

public class reversearray {
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
        System.out.println("index:");
        int m=sc.nextInt();

        int j=1;
        for(int i=m+1;i<n-m/2;i++)
        {
            int tmp=arr[i];
            arr[i]=arr[n-j];
            arr[n-j]=tmp;
            j++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");

        }

    }
}
