import java.util.Scanner;

public class minmax {

    public static void main(String[] args)
    {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<min)min=arr[i];
            if(arr[i]>max)max=arr[i];
        }

        System.out.println("Minimum value:"+min);
        System.out.println("Maximum value:"+max);

    }
}
