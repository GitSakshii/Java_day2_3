import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class unique2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of an array");
        int ans=0;

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            ans=ans^arr[i];
        }
        System.out.println("Unique element is :"+ ans);
    }
}
