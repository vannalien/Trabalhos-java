
package lista2;

import java.util.Scanner;

public class ex1 {


    public static void main(String[] args) {
       int x;
       Scanner entr = new Scanner (System.in);
    
       System.out.println("digite um número ");
       x = entr.nextInt ();
       
        if (x %2 == 0) {System.out.println("número é par");
                       }
        else {System.out.println("O número é impar");
             }
        
        
    }
    
}
