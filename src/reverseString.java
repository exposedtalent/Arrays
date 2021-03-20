import java.util.*;

public class reverseString {

    public static void  main ( String [] args){

        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter a String : ");
        String str = scan.nextLine();

        char [] c = str.toCharArray();
        String st = "";

        for(int i  = c.length - 1; i >= 0; i--){
            st += c[i];
        }

        if(st.equalsIgnoreCase(str)){
            System.out.println("This String " + str + " reverse is " + st  + " Which means it is also a palindrome" );
        }
        else {
            System.out.println("This String " + str + " reverse is " + st + " which means it is not a palindrome");
        }


    }
}
