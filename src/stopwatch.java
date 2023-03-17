import java.util.Scanner;

public class stopwatch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int UserChoice;
        long StartTime=0;
        long StopTime;
        long TimeElapsed;
        while(true){
            System.out.println("Enter your choice \t 1) Start \t 2) Stop  \t  3) exit");
            UserChoice=sc.nextInt();
            switch(UserChoice)
            {
                case 1: {
                    StartTime=System.currentTimeMillis();
                    System.out.println("Started at:- " +StartTime + "ms");
                }
                case 2 : {
                    StopTime=System.currentTimeMillis();
                    System.out.println("Stopped at :- " +StopTime +11 "ms");
                    TimeElapsed=StopTime-StopTime;
                    System.out.println(TimeElapsed);
                }
                case 3 : {
                    System.exit(0);
                }
            }
        }
    }
}
