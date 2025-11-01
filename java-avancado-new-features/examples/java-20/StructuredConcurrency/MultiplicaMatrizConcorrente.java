import java.util.concurrent.StructuredTaskScope;

public class MultiplicaMatrizConcorrente {

	public static void main(String[] args) throws InterruptedException {
		
		int[][] matrizA = {{-1, 3}, {7, 2}};
		int[][] matrizB = {{1, -2}, {1, 4}};
		
		int linhasA = matrizA.length;
		int colunasA = matrizA[0].length;
		
		int linhasB = matrizB.length;
		int colunasB = matrizB[0].length;
		
		int[][] matrizR = new int[linhasA][colunasB];
		
		if(colunasA != linhasB) {
			System.out.println("as dimensões das matrizes não são compatíveis para multiplicação.");
			return;
		}
		
		try(var scope = new StructuredTaskScope.ShutdownOnFailure()) { //Virtual thread
			
			for(int i=0; i < linhasA; i++) {
				final int linhaI = i;
				
				scope.fork( () -> {
					for(int j=0; j < colunasB; j++) {
							for(int k=0; k < matrizA[0].length; k++) {
								matrizR[linhaI][j] += matrizA[j][k] * matrizB[k][linhaI];
							}
					}
					return null;
				});
			}
			
			scope.join(); //Aguarda completarem todas a threads.
		}
		
		
		for(int i=0; i < linhasA; i++) {
			for(int j=0; j < colunasB; j++) {
				System.out.print(matrizR[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
