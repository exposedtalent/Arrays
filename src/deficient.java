import java.util.Scanner;

public class deficient {

    public static void main(String[] args) {
        deficient p = new deficient();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = scan.nextInt();
        p.isDeficient(num);
        int temp = num;

        if(p.isDeficient(num)){
            System.out.println("The number " + temp + " is a deficient number ");
        }
        else{
            System.out.println("The number " + temp + " is NOT a deficient number ");
        }

    }

    boolean isDeficient(int num){
        return (deficientSum (num) < (2  * num));

    }

    int deficientSum(int n){
        int sum = 0 ;

        for( int i = 1; i < Math.sqrt(n); i++){
            if( n % i == 0){

                if(n / i  == i){
                    sum = sum + i;
                }
                else{
                    sum = sum + i;
                    sum = sum + (n/i);
                }
            }
        }
        return sum;
    }
}
