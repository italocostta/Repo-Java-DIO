/*
Faça um programa que peça uma nota entre zero e dez.
Mostre a mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 */
package edu.italo.tema.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nota: ");
        int nota = sc.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
            System.out.printf("Nota: ");
            nota = sc.nextInt();
        }
    }
}
