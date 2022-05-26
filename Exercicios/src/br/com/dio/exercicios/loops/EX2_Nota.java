package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido
 */
public class EX2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;

        do{
            System.out.println("Nota: ");
            nota = scan.nextDouble();
            if(nota>=0 && nota <=10){
                System.out.println("valor correto");
            }else{
                System.out.println("Valor incorreto, digite novamente...");
            }
        }while(nota < 0 || nota >10);


    }
}
