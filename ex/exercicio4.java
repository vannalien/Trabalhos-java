
package ex;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) { 
        int h, mult, b, at;
        double l, aq, kg, m, imc;
        
        Scanner tec = new Scanner (System.in);
        System.out.println("Vamos calcular a área de um triângulo, primeiro digite sua altura: ");
        h = tec.nextInt() ;
        System.out.println("Agora digite o valor de sua base: ");
        b = tec.nextInt();
        mult = b*h;
        at = mult/2;
        System.out.println("A área do triângulo é: "+at);
        
        System.out.println("Agora vamos calcular a área de um quadrado. Digite o valor de seu lado: ");
        l = tec.nextInt();
        aq = Math.pow(l,2);
        System.out.println("A área do quadrado equivale a: "+aq);
        
        System.out.println("Por fim, vamos calcular seu IMC. Digite seu peso(kg): ");
        kg = tec.nextDouble();
        System.out.println("Digite sua altura (m):");
        m = tec.nextDouble();
        imc = kg/m;
        System.out.println("Seu imc é:"+imc);
    }
    
}
