
package ex;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) { 
           Scanner du = new Scanner (System.in);
         
        double km, mi;
        
        System.out.println("Digite um valor em km para converte-lo para milhas: ");
        km = du.nextDouble();
        mi = km/1.60934;
        System.out.println("O valor de "+km+" em milhas é: "+mi);
        
        
        
    }
    
}
