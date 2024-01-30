import java.util.Scanner;

public class checkarmstrong {
    static Boolean isarmstrong(int n)
    {
        int s=n;
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==s) return true;
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isarmstrong(n)==true){
        System.out.println(n+" is an armstrong number");}
        else {
            System.out.println("Not an armstrong number");
        }

    }
}
