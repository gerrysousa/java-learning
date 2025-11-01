
abstract class Figura2D {
	private int lados;
	private int comprimento;

	public Figura2D(int lados, int comprimento) {
		this.lados = lados;
		this.comprimento = comprimento;
	}
}

class Quadrado extends Figura2D {
		public Quadrado(int lados, int comprimento) throws IllegalArgumentException {
			if (lados != 4 || comprimento <= 0) {
	            throw new IllegalArgumentException("Isto não é um quadrado.");
	        }

			super(lados, comprimento);
		}
}


public class SuperEx {

	public static void main(String[] args) {

		try {
			Quadrado q = new Quadrado(4, -10);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
