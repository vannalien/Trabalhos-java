
package ex;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        
        Scanner aaa = new Scanner (System.in);
        int m, d;
    
        System.out.println("Digite um numero de meses para converte-lo em dias: ");
        m = aaa.nextInt();
        d = m*30;
        System.out.println( m + " meses equivalem a " + d + " dias" ); 
    }
  }
    
