import java.util.Scanner;

public class prime {


    public static void main(String[] args) {
        prime p = new prime();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = scan.nextInt();
        int x = p.isPrime(num,2);

        if(x == 1){
            System.out.println("This number "+ num +  " is a prime number");
        }
        else{
            System.out.println("This number " + num  + " is Not a prime number");
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
