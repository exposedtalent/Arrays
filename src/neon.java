import java.util.Scanner;

public class neon {


     int isNeon(int num) {
        int temp = num;
        int sqrt = num * num;
        int sum = 0;

        while (sqrt != 0) {
            int rem = (sqrt % 10);
            sum += rem;
            sqrt = sqrt / 10;
        }

        if (temp == sum) {
            System.out.println("this number " + temp + " is a neon number.");
            return 0;
        } else {
            System.out.println("this number " + temp + " is NOT a neon number.");
            return -1;

        }

    }

    public static void main(String[] args) {
        neon p = new neon();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = scan.nextInt();
        p.isNeon(num);


    }
}
