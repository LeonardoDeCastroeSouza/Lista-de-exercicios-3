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
public class exercicio_11 {
    
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);


 System.out.print("Digite dois numeros inteiros: ");


 int primeiroNumero = sc.nextInt();

 int segundoNumero = sc.nextInt();


 int menorNumero = 0;


 if (primeiroNumero < segundoNumero)

  menorNumero = primeiroNumero;

 else

  menorNumero = segundoNumero;


 int diferenca = Math.abs(primeiroNumero - segundoNumero);


 for (int i = 1; i < diferenca; i++)

  System.out.print(primeiroNumero + segundoNumero );


}
    
}
