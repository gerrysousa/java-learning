
public class VariavelSemNomeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int arrayInteiros[] = {5, 24, 8, 10, 55};
		
			System.out.println(arrayInteiros[10]);
		}
		catch(ArrayIndexOutOfBoundsException _) { //Variável sem nome na exceção
			System.out.println("Índice fora do limite do vetor");
		}
		
	}

}
