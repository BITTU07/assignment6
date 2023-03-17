import java.util.Scanner;

public class couponNumber {
    static  String[] couponArray;
    static String generateCoupon()
    {
        String str = " ";
        for (int i=0 ; i<=4; i++)
        {
            int randomDigit =(int)Math.random()*10;
            str =str +randomDigit;

        }
        String checkedDuplicacy = checkCoupon(str);
        return checkedDuplicacy;
    }
    static String checkCoupon(String newCoupon)
    {
        int check =0;
        for (String existing : couponArray)
            if(newCoupon == existing)
                check++;
        if(check!=0)
            generateCoupon();
        return newCoupon;

    }

    public static void main(String[] args) {
        String str ="";
        System.out.println("how many coupon number you want?");
        Scanner sc =new Scanner(System.in);
        int coupon= sc.nextInt();
        couponArray= new String[coupon];

        for(int i=0; i<coupon;i++)
        {
            str =generateCoupon();
            System.out.println("coupon number "+(i+1)+" :      "+str);
        }
        sc.close();
    }

}
