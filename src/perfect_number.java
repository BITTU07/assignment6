import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to check weather it is perfect or not");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1; i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
                System.out.println(i+ " ");
            }
        }
        if(num ==sum)
        {
            System.out.println(num+ " is perfect");
        }
        else
        {
            System.out.println("not perfect");
    }


    }
}
