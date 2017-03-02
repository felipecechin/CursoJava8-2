package unidade3;

import java.util.Scanner;

public class Atividade1App {
	public static void main(String[] args) {
		/*Atividade1 obj = new Atividade1();
		obj.<Integer>listaImpar(1,2,3,4,5); */
		
		Scanner scn = new Scanner(System.in);
		Integer vetor[] = new Integer[5];
		int posicao1;
		int posicao2;
		
		
		for (int i=0;i<5;i++) {
			System.out.println("Digite um número na posição ["+i+"] do vetor de 5 posições:");
			vetor[i] = scn.nextInt();
		}
		
		System.out.println("Digite uma posição: ");
		posicao1 = scn.nextInt();
		
		System.out.println("Digite outra posição: ");
		posicao2 = scn.nextInt();
			
		System.out.println("VETOR:");
		for (int valor1:vetor) {
			System.out.println(valor1);
		}
		
		Atividade1 obj = new Atividade1();
		Integer vetorNovo[] = obj.<Integer>swap(vetor, posicao1, posicao2);
		
		
		System.out.println("VETOR COM POSIÇÕES TROCADAS:");
		for (int valor2:vetorNovo) {
			System.out.println(valor2);
		}
	}
}
