import java.util.Scanner;

public class findelement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of an array");
        int ans;

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        int []check=new int[n];
        for(int i=0;i<n;i++)
        {
            check[arr[i]-1]++;
        }
        int missingele=-1,duplicate=-1;
        for(int i=0;i<n;i++)
        {
            if(check[i]==0)
            {
                missingele=i+1;
            }
           if (check[i]==2)
               duplicate = i + 1;
        }
        System.out.println("missing element is "+missingele+" duplicate element is "+ duplicate);

    }
}
