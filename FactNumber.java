public class FactNumber {
    // Factorial Of Number::- A Factorial is a function that multiplies a number by every number below it.

    public static void main(String[] args) {
        int num = 5;
        long factorial = 1;


//          5!  = 5 * 4 * 3 * 2 * 1
        // for (int i = 1; i <= num; i++) {
        //     factorial = factorial * i;         
        // }

        // 5! = 1 * 2 * 3 * 4 * 5
        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }


    
}
