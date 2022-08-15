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
public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int[] vet = new int[5];

        int a,num=0;
        for (a=0;a<vet.length;a++){
            System.out.print ("Digite 5 numeros :");
            vet[a] =sc.nextInt();

                if (num<vet[a]){
                    num=vet[a];
                }
        }
        System.out.println("o maior numero é :"+num);

    }

}
        
  

