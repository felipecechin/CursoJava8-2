package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp3 {
	
	static int numero;
	int somatorio;
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4);
		LambdaApp3 app = new LambdaApp3();
		//System.out.println(integers);
		/*
		for(Integer inteiro:integers) {
			inteiro = inteiro + 10;
			System.out.println(inteiro);
		}
		 */
		integers.forEach(x->{
			numero = 10;
			x = x + numero;
			app.somatorio = app.somatorio + x;
			System.out.println(x);	
		});
		System.out.println(app.somatorio);
		
	}

}
