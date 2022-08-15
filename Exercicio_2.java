/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lista_03;

import java.util.Scanner;



/**
 *
 * @author labinfo
 */
public class Lista_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = null, senha = null;

        while ((nome).equals(senha)) {

            System.out.println("Registre seu nome ");
            nome = sc.next();

            System.out.println("Registre sua senha");
            senha = sc.next();

            System.out.println("o nome de usuario não pode ser igual a senha");

        }

    }
}
