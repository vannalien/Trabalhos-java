package lista2;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
       int ano;
       Scanner entr = new Scanner (System.in);
       
       System.out.println("Digite um ano: ");
       ano = entr.nextInt();
       
        if (ano<2020) {System.out.println(ano+" é do passado");}      
       else 
        if (ano == 2020) {System.out.println(ano+" é o ano atual");}           
       else 
        if (ano>2020){System.out.println(ano+" é futuro");}
                          
    }
}
        
    
    

