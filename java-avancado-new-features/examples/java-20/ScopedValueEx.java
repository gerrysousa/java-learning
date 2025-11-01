
public class ScopedValueEx {

	//Valor com escopo (variável compartilhada)
	public static final ScopedValue<String> NOME = ScopedValue.newInstance();
	
	public static void main(String[] args) {
		
		/* Vincula a varíavel a tarefa executada (insere no escopo).
		 * Método estático where definindo um valor para variável compartilhada
		 * NOME dentro do período limitado de execução da thread.
		 */
		ScopedValue.where(NOME, "Maria").run(() -> imprimeSaudacao());
		
	}
	
	private static void imprimeNome(String nome) {
		System.out.println("Eu sou " + nome);
	}
	
	private static void imprimeOla() {
		System.out.print("Olá! ");
		//Método get da classe ScopedValue devolve o valor com escopo desde que esteja associaado a thread corrente.
		imprimeNome(NOME.get());
	}
	
	private static void imprimeSaudacao() {
		imprimeOla();	
	}

}
