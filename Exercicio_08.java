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
public class Exercicio_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,b,c,d,e,soma,result;
        
        System.out.println("Insira 5 números");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        
        soma = (a + b + c + d + e);
        
        result = (soma / 5);
        
        System.out.println("A média desses números é " + result );
        
    }
    
}
