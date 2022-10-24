/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas e imprima as consoantes
 */
package edu.italo.tema.arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtConsoantes = 0;
        int count = 0;
        do {
            System.out.print("Letra: ");
            String letra = sc.next();
            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                qtConsoantes++;
            }
            count++;
        } while(count < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if ( consoante != null)
             System.out.print(consoante + " ");
        }
        System.out.println("\nQuantidade de consoantes: " + qtConsoantes);
    }
}
