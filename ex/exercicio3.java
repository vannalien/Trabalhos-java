
package ex;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        
        int x, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10;
        
        Scanner tec = new Scanner (System.in);
        System.out.println("Digite um número de 0 a 10 para ver sua tabuada");
        x = tec.nextInt();
        
        m1 = x*1;
        m2 = x*2;
        m3 = x*3;
        m4 = x*4;
        m5 = x*5;
        m6 = x*6;
        m7 = x*7;
        m8 = x*8;
        m9 = x*9;
        m10 = x*10;
        
        System.out.println("a tabuada de " + x + " é: " + m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10);
       
}
    }
