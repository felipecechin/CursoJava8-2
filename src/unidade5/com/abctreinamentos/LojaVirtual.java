package unidade5.com.abctreinamentos;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.List;

public class LojaVirtual {
	static Map<Cliente,List<Curso>> pagamentos = new HashMap<>();
	
	public static void listarCursos(List<Curso> lista) {
		//lista.forEach(p->System.out.println(p.getCdcurso()+"<=>"+p.getNome()));
		lista.forEach(System.out::print);
	}
			

	public static void main(String[] args) {
		//Criar os cursos disponíveis no site para venda
		Curso java8 = new Curso("Java 8 para web", 1, 2000, Paths.get("/java8"));
		Curso oracle12c = new Curso("Oracle 12C", 2, 2500, Paths.get("/oracle12c"));
		Curso php7 = new Curso("PHP 7", 3, 1500, Paths.get("/php7"));
		
		//Cadastrar o cliente
		Cliente antonio = new Cliente("98123981", "Antonio Sampaio", "teste@hotmail.com");
		
		
		//Criar a lista de cursos do cliente
		List<Curso> cursosAntonio = new LinkedList<>();
		
		//Fazer um checkout dos cursos escolhidos
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		while(opcao!=4) {
			System.out.println("Qual o curso deseja adquirir: (1-Java8),(2-Oracle12C),(3-Php 7),(4-Finalizar compra)");
			opcao = entrada.nextInt();
			if (opcao==1) {
				cursosAntonio.add(java8);
			} else if (opcao==2) {
				cursosAntonio.add(oracle12c);
			} else if (opcao==3) {
				cursosAntonio.add(php7);
			} else {
				opcao=4;
			}
		}
		entrada.close();
		pagamentos.put(antonio,	cursosAntonio);
		System.out.println(pagamentos);
		//listarCursos(cursosAntonio);
		
		//Referência de Métodos
		Consumer<List<Curso>> consumer = LojaVirtual::listarCursos;
		consumer.accept(cursosAntonio);
	}
}
