import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String :- " );

        String str = sc.nextLine();
        String originalString = str;
        
        String rev = "";
        int len = str.length();
      
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
            if (originalString.equals(rev)) {
                System.out.println(originalString + " is a palindrome String");
            }else{
                System.out.println(originalString + " is Not Palindrome String");
            }
    }
         
}
