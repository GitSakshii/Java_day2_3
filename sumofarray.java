import java.util.Scanner;


public class sumofarray {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of  array1");


        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        int[] arr2=new int[n];
        System.out.println("Enter the elements of an array2");
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();

        }
        int l=n+1;
        int carry=0;
        int [] arr3=new int[l+1];
        for(int i=n;i>0;i--)
        {
            int sum= carry+arr[i-1]+arr2[i-1];
            arr3[i]=sum%10;
            carry=sum/10;
        }
        if(carry!=0)
        {
            arr3[0]=carry;
        }

        if(arr3[0]!=0)
        {
            System.out.print(arr3[0]);

        }
        for(int i=1;i<l;i++)
        {
            System.out.print(arr3[i]);
        }


    }
}
