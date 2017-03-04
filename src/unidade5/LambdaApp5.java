package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp5 {
	
	static int numero;
	int somatorio;
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4);
		LambdaApp5 app = new LambdaApp5();
		//System.out.println(integers);
		/*
		for(Integer inteiro:integers) {
			inteiro = inteiro + 10;
			System.out.println(inteiro);
		}
		 */
		integers.forEach((Integer x)->{
			float y = x/2f;
			System.out.println(y);
			numero = 10;
			x = x + numero;
			app.somatorio = app.somatorio + x;
			System.out.println(x);	
		});
		System.out.println(app.somatorio);
		
	}

}
