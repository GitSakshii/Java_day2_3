import java.util.Random;

public class randomno {
    public static void main(String[] args)
    {
        System.out.println("Random number:" +Math.random());
        Random r=new Random();
        System.out.println(r.nextInt(1000));
        // Generate random integers in range 0 to 999
        System.out.println(r.nextDouble());
        //Generate random double
    }
}
