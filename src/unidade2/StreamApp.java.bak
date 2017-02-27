package unidade2;

import java.io.FileInputStream;
import java.util.Scanner;

public class StreamApp {
	
	public static void byteStream() throws Exception {
		FileInputStream entrada = new FileInputStream("C:/Users/Felipe/workspace/2Disciplina/src/unidade2/dados.txt");
		int contador = 0;
		while ((entrada.read()) != -1) {
			contador++;
		}
		System.out.println("Número de caracteres é:"+contador);
		entrada.close();
	}
	
	public static void caracterStream(char letra) throws Exception {
		FileInputStream entrada = new FileInputStream("C:/Users/Felipe/workspace/2Disciplina/src/unidade2/dados.txt");
		int contador = 0;
		int c;
		while ((c = entrada.read()) != -1) {
			if (c == letra) {
				contador++;
			}
		}
		System.out.println("Número de vezes que a letra informada foi encontrada é:"+contador);
		entrada.close();
	}
	
	public static void main(String[] args) {
	/*	try {
			byteStream();
		} catch (Exception e) {
			e.printStackTrace();
		} */
		try {
			System.out.println("Informe uma letra: ");
			char letra = (char) System.in.read();
			caracterStream(letra);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
