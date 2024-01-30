import java.util.Scanner;

public class infinitearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l=sc.nextInt(),r=sc.nextInt();
        int i,cnt=0;
        int ans=0;
        while(l<=r)
        {   i=l%n;
            ans+=arr[i];
            l++;
        }
        System.out.println("OUTPUT:"+ans);

    }

}
