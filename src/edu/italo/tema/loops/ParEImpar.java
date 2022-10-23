/*
Faça um programa que peça N números inteiros, calcule e mostre a quantidade de numeros pares
e a quantidade de números impares.
 */
package edu.italo.tema.loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtNumeros;
        int count = 0;
        int numero;
        int qtPares = 0 , qtImpares = 0;

        System.out.print("Quantidade de números: ");
        qtNumeros = sc.nextInt();

        do {
            System.out.print("Numero: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                qtPares++;
            } else {
                qtImpares++;
            }

            count++;
        } while(count < qtNumeros);

        System.out.println("Numeros pares: "+qtPares);
        System.out.println("Numeros impares: "+qtImpares);
    }
}
