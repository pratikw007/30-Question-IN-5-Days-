import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NUmber: ");

        int num = sc.nextInt();
        int original_number =  num;
        int rev = 0;
        
        while (num != 0) {
            rev = rev*10 + num %10;
            num = num /10;
        }

        if (original_number == rev) {
            System.out.println(original_number + " PALINDROME NUMBER");  
        }else{
            System.out.println(original_number + " Is Not the Palindrome number");
        }
    
    }
}
