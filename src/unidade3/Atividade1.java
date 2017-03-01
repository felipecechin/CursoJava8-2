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
		for (int i=0;i<vetorNovo.length;i++) {
			if (i==posicao1) {
				varTemp = vetorNovo[posicao1];
				vetorNovo[posicao1] = vetorNovo[posicao2];
				vetorNovo[posicao2] = varTemp;
			}
		}
		return vetorNovo;
	}
}
