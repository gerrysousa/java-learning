
public class MultiplicaMatriz {

	public static void main(String[] args) {
		
		int[][] matrizA = {{-1, 3}, {4, 2}};
		int[][] matrizB = {{1, 2}, {3, 4}};
		
		int linhasA = matrizA.length;
		int colunasA = matrizA[0].length;
		
		int linhasB = matrizB.length;
		int colunasB = matrizB[0].length;
		
		int[][] matrizR = new int[linhasA][colunasB];
		
		if(colunasA != linhasB) {
			System.out.println("as dimensões das matrizes não são compatíveis para multiplicação.");
			return;
		}
		
		for(int i=0; i < linhasA; i++) {
			for(int j=0; j < colunasB; j++) {
				for(int k=0; k < matrizA[0].length; k++) {
					matrizR[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}
		
		for(int i=0; i < linhasA; i++) {
			for(int j=0; j < colunasB; j++) {
				System.out.print(matrizR[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
