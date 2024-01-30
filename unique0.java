import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class unique0 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of an array");
        int ans=-1;
        int[] visited=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

        for(int i=0;i<n;i++)
        {
            if(visited[i]==0) {
                int cnt = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == arr[i])
                    {cnt++;
                    visited[j] = 1;}
                }

            if(cnt==1){ans=arr[i];
            break;}
            }
        }
        System.out.println("unique element:" + ans);
    }
}
