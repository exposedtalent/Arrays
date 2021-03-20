import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class duplicate {

    public static void main ( String [] args){

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a string");
        String str = scan.nextLine();
        char[] c =  str.toCharArray();
        String s = "";

        for(char i : c){
            if(s.indexOf(i) == -1){
                s += i;
            }
        }

        System.out.println("The string without duplicates and white spaces : " + s.replaceAll("\\s+" , ""));
        System.out.println("The string is upper case : " + str.toUpperCase());
        System.out.println("The string is lower case : " + str.toLowerCase());
    }
}
