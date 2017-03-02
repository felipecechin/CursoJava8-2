package unidade4.com.abctreinamentos;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
	Set<Curso> cursos;
	
	public Set<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}

	public static void main(String[] args) {
		Curso java8 = new Curso("Java8");
		Curso oracle12c = new Curso("Oracle12c");
		
		Set<Curso> cursosA = new HashSet<>();
		Set<Curso> cursosB = new HashSet<>();
		
		cursosA.add(java8);
		cursosA.add(oracle12c);
		cursosB.add(java8);
		
		//Interse��o
		cursosB.removeAll(cursosA);
		System.out.println("B - A");
		System.out.println(cursosB);
		
		Cliente A = new Cliente();
		A.setCursos(cursosA);
		Cliente B = new Cliente();
		B.setCursos(cursosB);
	}
}
