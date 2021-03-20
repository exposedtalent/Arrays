import java.util.*;


public class palidrome {

    public static void main(String [] args)  {

        palidrome p = new palidrome();
        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter a number : ");
        int num = scan.nextInt();

        p.ispalindrome(num);
    }

    int ispalindrome(int num ){
        int tempnum = num;
        int num1 = num * num;
        int temp2 = num1;
        int sum = 0, sum1 = 0;
        // for palindrome
        while(num > 0) {
            int r = num % 10;
            sum = sum * 10 + r;
            num  = num /10;
        }
        // for super palindrome
        while (num1 > 0){
            int i = num1 % 10;
            sum1 = sum1 * 10 + i;
            num1 = num1 /10;
        }

        if(tempnum == sum ){
            if( temp2 == sum1) {
                System.out.println("This number " + tempnum + " is a Super palindrome and a palindrome number");
                return 0;
            }
            else{
                System.out.println("This number " + tempnum + " is a palindrome number");
                return 0;
                }
            }

        else{
            System.out.println("This number "+ tempnum + " is NOT a palindrome or a super palindrome number");
            return -1;
        }
    }
}
