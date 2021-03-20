import java.util.Scanner;

public class happyNum {


    static int isHappy(int num) {

        int rem = 0, sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        happyNum p = new happyNum();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = scan.nextInt();
        int temp = num;

        while (temp != 1 && temp != 4) {
            temp = p.isHappy(num);
        }

        if(temp == 1){
            System.out.println("this number "+ temp + " is a happy number." );
        }
        else{
            System.out.println("this number "+ temp + " is NOT a happy number." );

        }



    }
}
