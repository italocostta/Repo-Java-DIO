/*
Faça um programa que leia um conjunto de dois valores. O primeiro que represente o nome do aluno e o segundo a idade.
Pare o programa quando for digitado "0" n campo "nome".
 */
package edu.italo.tema.loops;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Digite seu nome:");
            String nome = sc.next();
            if (nome.equals("0"))
                break;
            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();

        }

        System.out.println("Saiu do laço.");


    }
}
