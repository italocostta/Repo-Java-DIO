/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
e armazene-os num veto e ao final mostra os números e seus sucessores.
 */
package edu.italo.tema.arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i=0; i<numerosAleatorios.length; i++) {
            int numero = rnd.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.print("\nAntecessor dos Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
        System.out.print("\nSucessores dos Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
