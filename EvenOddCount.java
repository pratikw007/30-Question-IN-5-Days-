public class EvenOddCount {
    public static void main(String[] args) {
        int num = 123489393;
        int evenCout=0;
        int oddCount=0;

        while (num>0) {
            int rem = num % 10;
          if(rem % 2 == 0){
            evenCout++;
          }else{
            oddCount++;
          }
          num = num / 10;
        }

        System.out.println("Number Of Even Count "+evenCout);
        System.out.println("Number Of Odd Count "+oddCount);

    }
}
 