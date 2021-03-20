import java.util.Scanner;

public class perfect {
    private int sum = 0;
    public static void main(String[] args) {
        int i = 1;
        perfect p = new perfect();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = scan.nextInt();

        int x = p.isperfect(num, i);

        if(num == x){
            System.out.println("The number " + num + " is a perfect number");
        }
        else {
            System.out.println("The number " + num + " is NOT a perfect number");
        }
    }


    int isperfect( int num, int i ){
        if( i <= num /2){

            if(num % i == 0){
                sum += i;
            }
            i++;
            isperfect(num,i);
        }
        return sum;
    }
}
