public class SwapingOfTwoNumbers {
    // 5 Ways To swap number

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping of Two Number " + a + " " + b);
        // Logic 1: Using Swaping by temp variable
        // int temp = a;
        //  a = b;
        //  b = temp;

        //  System.out.println("After Swapping of Two Number "+a+" "+b);
        
        
        // Logic 2 : Using Addition And substraction  without using temp variable
        // a = a+b; ///10+20 = 30
        // b = a-b; //30 - 20 = 10
        // a = a-b; // 30 - 10 = 20
        //  System.out.println("After Swapping of Two Number "+a+" "+b);
        
        
        // Logic 3: Using Multiply And Division Operator
        // a = a * b; // 10*20 =200
        // b = a / b; // 200 / 10 = 20
        // a = a / b; // 200 / 20 = 10
        //  System.out.println("After Swapping of Two Number "+a+" "+b);
        
        // Logic 4 : using Bitwise XOR Operator (^)
        // a = a^b; //1010 ^ 10100 = 11110(30)
        // b = a^b; // 30^20 = 10;
        // a = a^b; // 30 ^ 10 = 20
        //  System.out.println("After Swapping of Two Number "+a+" "+b);
        
        // Logic 5 : using Single Statemet
        b = a+b - (a = b);
         System.out.println("After Swapping of Two Number "+a+" "+b);

        





    }

}
