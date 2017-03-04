package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4);
		//System.out.println(integers);
		/*
		for(Integer inteiro:integers) {
			inteiro = inteiro + 10;
			System.out.println(inteiro);
		}
		 */
		integers.forEach(x->System.out.println(x));	
	}

}
