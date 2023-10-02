public class PrimeNumber {

    // natural number > 1
    // which has only two factor
public static void main(String[] args) {
    int num = 10;
    int count = 0;

    if(num>1){
        for (int i = 1 ; i < num; i++) {
            if(num % i ==0){
                count++;
            }   
        }
        if (count == 2) 
            System.out.println("Prime Number");
        else 
            System.out.println("Not a Prime umber");
        
    }
    System.out.println("Not a Prime Number");
}

    
}
