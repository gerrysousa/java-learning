
record Retangulo(double largura, double altura) {
	
}

public class UnnamedPatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo r1 = new Retangulo(300.0, 200.0);
		
		print(r1);

	}
	
	private static void print(Object obj) {
		if(obj instanceof Retangulo(_, _)) { //unnamed pattern
			System.out.println("Este é um retangulo");
		}
		else {
			System.out.println("Isto não é um retângulo");
		}
	}

}
