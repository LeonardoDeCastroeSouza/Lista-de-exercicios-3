/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista_03;

import java.util.Scanner;

/**
 *
 * @author Leona
 */
public class Exercicio_03 {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);  
        
      String nome = null ,sexo ,estciv ;
      
      int idade = -1 ,salario;
      
        
       System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        
                     
        while (nome.length() < 3) {  
         System.out.println("erro o nome deve ter mais de 3 letras ");
         nome = sc.nextLine(); 
        }  
         
        System.out.println("Qual o sua Idade?");
         idade = sc.nextInt();
        
        while ((idade < 1)||(idade > 150)) { 
         System.out.println("Erro");
         idade = sc.nextInt();
        }
        
        System.out.println("Qual o seu salario");
         salario = sc.nextInt();
        
        while (salario < 0) {
         System.out.println("Erro seu salario não pode ser 0 ou menor que 0");
         salario = sc.nextInt();
        }
         
        System.out.println("Qual o seu sexo?");
         sexo = sc.nextLine();
        
        while ((! "f".equals(sexo))&&(! "m".equals(sexo))){
         System.out.println("Insira f ou m");
          sexo = sc.nextLine();
        }
        
        
        System.out.println("Qual o seu estado civil?");
         estciv = sc.nextLine();
        
        while ((! "s".equals(estciv))&&(! "c".equals(estciv))&&(! "v".equals(estciv))&&(! "d".equals(estciv))){
            System.out.println("Erro");
            estciv = sc.nextLine();
        }
    
    
    }
}               
        
      
    
    

    

