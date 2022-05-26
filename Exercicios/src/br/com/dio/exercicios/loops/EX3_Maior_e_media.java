package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números
 */
public class EX3_Maior_e_media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;
        double total = 0;
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero > maior) maior =numero;
            ++count;
            total += numero;
        }while(count<5);
        System.out.println(maior);
        System.out.println(total/5);
    }
}
