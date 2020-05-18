package lista2;

import java.util.Scanner;

public class ex3 {

   
    public static void main(String[] args) {
       Scanner entr = new Scanner (System.in);
       String nome;
       double n1, n2, media, soma;
       
        System.out.println("Olá, digite o seu nome: ");
        nome = entr.nextLine();
        
        System.out.println("Digite sua primeira nota");
        n1 = entr.nextDouble();
        
        System.out.println("Digite sua segunda nota:");
        n2 = entr.nextDouble();
        
        soma = n1 + n2;
        media = soma/2;
        
         if (media < 4) { System.out.println(" Nome: " + nome +"\nMédia: " + media +"\nSituação: Reprovado"); 
        } else if ((media >=4) && ( media <6 )) { System.out.println (" Nome: " + nome +"\nMédia: " + media +"\nSituação:Recuperação");
        } else {System.out.println("Nome: " + nome +"\nMédia: " + media +"\nSituação: Aprovado");
            
        }
            
        
    }
    
}

