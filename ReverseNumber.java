import java.util.*;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
    // ---------------LOGIC 1----------------------
        // int rev = 0;
        
        // while (num != 0) {
        //     rev = rev*10 + num %10;
        //     num = num / 10;
        // }

// ----------Logic 2: Using String Buffer Class------------
            // StringBuffer sb = new StringBuffer(String.valueOf(num));  //Convert the Number into String 
            // StringBuffer rev = sb.reverse();

            // --------Use String Builder -----------
                StringBuilder sb = new StringBuilder();
                sb.append(num);
                StringBuilder rev = sb.reverse();
                 System.out.println("Reverse Number is : "+rev);
    }
    
}
