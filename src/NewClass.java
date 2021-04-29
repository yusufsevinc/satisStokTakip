
import java.util.*;
import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
class Solution {

    public static void main(String[] args) {
        Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }

        in.close();
    }

}

class Parser {

    public boolean isBalanced(String deger) {
        boolean kontrol = false;
        char a = deger.charAt(0);
        char b = deger.charAt(deger.length() - 1);

        if (deger.charAt(0) == '(' && deger.charAt(deger.length() - 1) == ')') {
            kontrol = true;
            return kontrol;

        }
        if (deger.charAt(0) == '{' && deger.charAt(deger.length() - 1) == '}') {
            kontrol = true;
            return kontrol;
        }
        else{
        for (int i = 0; i <deger.length(); i++) {
            
            if(deger.charAt(i) == deger.charAt(i+1)){
               if (deger.charAt(i) == '(' && deger.charAt(i+1) == ')') {
            kontrol = true;
            return kontrol;

        }
        if (deger.charAt(i) == '{' && deger.charAt(i+1) == '}') {
            kontrol = true;
            return kontrol;
        }
                             

            }
            
            
        }
               return kontrol;
        }
        

       
    }

}
