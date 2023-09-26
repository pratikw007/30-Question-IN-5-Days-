public class ReverseString {
    public static void main(String[] args) {
        // Using String Cocatination Operation
        String str = "ABCD";
        String rev  = "";

        // LOGIC 1

        // int len = str.length(); //4
        
        // for (int i = len -1; i >= 0; i--) {  //3(D) 2(C) 1(B) 0(A)
        //     rev = rev + str.charAt(i);  // D  C B A          
        // }



        // LOGIC 2
        // char ch[] = str.toCharArray();
        // for (int i = ch.length-1; i >= 0 ; i--) {
        //     rev = rev + ch[i];
        // }


        // ----------Logic 3 Using String Buffer Class---------------
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        // System.out.println("Reverse String is "+rev);
    }
}
