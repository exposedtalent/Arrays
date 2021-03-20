import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class palprime {

    public void main(String[] args)  {

        palprime p = new palprime();
        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter a number : ");
        int num = scan.nextInt();
        int temp = num;

        int x = p.isPrime(num,2);
        p.ispalindrome(num);

        if(x == 1 && ispalindrome(num) == true){
            System.out.println("This number " + temp + " is a palprime number");
        }
        else {
            System.out.println("This number "+ temp + " iss not a palprime number");
        }
    }

    boolean ispalindrome(int num ) {
        int tempnum = num;
        int num1 = num * num;
        int temp2 = num1;
        int sum = 0, sum1 = 0;
        // for palindrome
        while (num > 0) {
            int r = num % 10;
            sum = sum * 10 + r;
            num = num / 10;
        }

        if(tempnum == sum){
            return true;
        }
        else {
            return false;
        }
    }

    int isPrime(int num, int x){
        if(x < num) {

            if(num % x != 0){
                return isPrime(num, ++x) ;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
}
