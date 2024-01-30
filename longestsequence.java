import java.util.Arrays;
import java.util.Scanner;

public class longestsequence {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0,mx=0;
        int l=0;
        int fi=0;
        int cnt=1;
       while(i<n-1)
       {
           if(arr[i+1]==arr[i]+1)
           {
               cnt++;
           }
           else{
               cnt=0;
               l=i;
           }
           if(cnt>mx)
           {
               mx=cnt;
               fi=l+mx;

           }
               i++;

       }

       for(int j=fi-mx;j<fi;j++)
       {
           System.out.print(arr[j]+" ");
       }

    }
}
