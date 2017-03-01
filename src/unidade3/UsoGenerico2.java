package unidade3;

public class UsoGenerico2 {
	public static void main(String[] args) {
		
		Login<String, String> iob = new Login<>("Felipe", "123");
		
		iob.showType();
	}
}
