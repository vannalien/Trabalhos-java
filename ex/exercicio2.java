/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.util.Scanner;

/**
 *
 * @author alves
 */
public class exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1, n2, n3, n4, div, soma;
        String nome;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite seu nome");
        nome = teclado.next();
        System.out.println("Digite a primeira nota: ");
        n1 = teclado.nextInt();
        System.out.println("Digite a segunda nota: ");
        n2 = teclado.nextInt();
        System.out.println("Digite a terceira nota: ");
        n3 = teclado.nextInt();
        System.out.println("Digite sua quarta nota: ");
        n4= teclado.nextInt();
       
        soma = n1+n2+n3+n4;
        div = soma/4;
        
        System.out.println("A sua média de matemática é: "+div);
        
       
    }
    
}