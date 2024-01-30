import java.util.Scanner;

public class fibbonacci {


    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        int s=0;
        int t1=0,t2=1;
        System.out.print(s+" ");
        System.out.print(t2+" ");
        for (int i=1;i<n-1;i++)
        {
            s=t1+t2;
            t1=t2;
            t2=s;
            System.out.print(s+" ");
        }
    }
}
