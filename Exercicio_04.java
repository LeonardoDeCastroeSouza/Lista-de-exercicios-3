/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_03;

import java.util.Scanner;

/**
 *
 * @author Leona
 */
public class Exercicio_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d;   

int ano=0;       

        System.out.println("Insira o tamanho das populações");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Insira as taxas de crescimento");
        c = sc.nextDouble();
        d = sc.nextDouble();



do { 

     
 
c = c / 100;

d = d / 100;

a = a + a*c;     

b = b + b*d;

ano=ano+1;    

}while (a<=b);
   System.out.println(ano);  
  
    }               
            
    
          
           
                  
       
         
        
        
    }



