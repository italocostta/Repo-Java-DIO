/*
Desenvolva um gerador de tabuadas capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada do 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */
package edu.italo.tema.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tabuada: ");
        int tabuada = sc.nextInt();

        System.out.println("Tabuada do: " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}
