import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean flag=true;
        System.out.println(" enter a number");
        int a= sc.nextInt();
        for ( int i=2; i<=a/2; i++)
            if(i%2==0)
            {
                System.out.println("prime number");
                flag =false;
                break;
            }
        if (flag ==true)
        {
            System.out.println(" prime");
        }
    }

}
