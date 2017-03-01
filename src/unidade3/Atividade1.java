package unidade3;

public class Atividade1 {
	<T extends Integer>void listaImpar(T ...numeros) {
		for (T num:numeros) {
			try {
				if (num%2==1) {
					System.out.println(num);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	<T> T[] swap(T vetorNovo[],int posicao1,int posicao2) {
		T varTemp;
		T outroVetor[] = vetorNovo;
		for (int i=0;i<outroVetor.length;i++) {
			if (i==posicao1) {
				varTemp = outroVetor[posicao1];
				outroVetor[posicao1] = outroVetor[posicao2];
				outroVetor[posicao2] = varTemp;
			}
		}
		return outroVetor;
	}
}
