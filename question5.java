import java.util.Scanner;

public class question5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        if(q==1)
        {
            System.out.println(n*(n+1)/2);
        }
        else if(q==2){
            int pro=1;
            for(int i=1;i<=n;i++)
            {
                pro=pro*i;
            }
            System.out.println(pro);
        }
    }
}
