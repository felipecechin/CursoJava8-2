package unidade5;

public class Calculadorav2 {
	public static void main(String[] args) {
		Calculadorav2 objeto = new Calculadorav2();
		IMath somar = (a,b)->a+b;
		IMath subtrair = (a,b)->a-b;
		IMath multiplicar = (a,b)->a*b;
		IMath dividir = (a,b)->a/b;
		IMath exponenciacao = (a,b)->Math.pow(a, b);
		IMath radiciacao = (a,b)->Math.pow(a, 1/b);
		/*****Chmada das Expressões Lambdas*******/
		
		System.out.println(somar.operacao(1, 2));
		System.out.println(subtrair.operacao(5, 1));
		System.out.println(multiplicar.operacao(5, 3));
		System.out.println(dividir.operacao(5, 3));
		System.out.println(exponenciacao.operacao(5, 3));
		System.out.println(radiciacao.operacao(5, 3));
	}
	
	
}
