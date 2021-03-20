import java.util.*;


public class Armstrong {

    public static void main(String [] args)  {

        Armstrong ar = new Armstrong();
        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter a number : ");
        int num = scan.nextInt();
        ar.isArmstrong(num);
    }

    int isArmstrong(int num ){
        int tempnum = num;
        int sum = 0 ;

        while(num > 0) {
            int r = num % 10;
            sum = sum + (r * r * r);
            num  = num /10;
        }

        if(tempnum == sum ){
            System.out.println("This number "+ tempnum + " is a Armstrong number");
            return 0;
        }
        else{
            System.out.println("This number "+ tempnum + " is NOT a Armstrong number");
            return -1;
        }
    }
}
