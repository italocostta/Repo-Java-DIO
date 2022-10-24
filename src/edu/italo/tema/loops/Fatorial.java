/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5! = 120 (5x4x3x2x1)
 */
package edu.italo.tema.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fatorial = sc.nextInt();

        int multiplicacao = 1;

        for (int i = fatorial ; i >= 1 ; i--) {
            multiplicacao = multiplicacao * i;
        }
        System.out.println(fatorial + "!" + " = " + multiplicacao);
    }
}
