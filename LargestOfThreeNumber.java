import java.util.Scanner;

public class LargestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the First number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();

        System.out.println("Enter the Third Number: ");
        int c = sc.nextInt();
        
        // Logic 1
        // if(a>b && a>c){
        //     System.out.println(a+" is Largest Number");
        // }else if(b>a && b>c){
        //     System.out.println(b+" is Largest Number");
        // }else{
        //     System.out.println(c+" is Largest Number");
        // }

        //logic 2 - using ternari operator
         int largest = a > b ? a:b; //largest of a & b
         int largest1 = c > largest ? c : largest; //largest  of c & largest1

         System.out.println(largest1);
    }
}
