package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
 */
public class EX1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {0,-5,15,50,8,4};
        int count = 0;
        System.out.println("\n Vetor:");
        while(count < vetor.length){
            System.out.println(vetor[count]+ " ");
            count++;
        }
        System.out.println("\n Vetor:");
        for(int i = vetor.length-1; i>= 0;i--){
            System.out.println(vetor[i]+ " ");
        }
    }
}
