import java.util.Scanner;

public class Buzz {

    public static void main(String[] args) {
        Buzz p = new Buzz();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = scan.nextInt();
        p.isBuzz(num);

    }

    int isBuzz(int num){
        int temp = num;

        if(num % 7 == 0 || num % 10 == 7){
            System.out.println("The number "+ temp  + " is a Buzz number");
            return 0;
        }
        else{
            System.out.println("The number "+ temp  + " is NOT a Buzz number");
            return -1;

        }
    }
}
