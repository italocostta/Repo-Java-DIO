/*
Faça um programa que leia 5 números
e informe o maior numero e a média desses números.
 */
package edu.italo.tema.loops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int media;
        int soma = 0;

        do {
            System.out.print("Número: ");
            numero = sc.nextInt();

            soma = soma + numero;
            media = soma / 5;

            if (numero > maior) {
                maior = numero;

            }
            count++;

        } while(count < 5);

        System.out.println("Maior numero: " + maior);
        System.out.print("Media: " + media);
    }
}
