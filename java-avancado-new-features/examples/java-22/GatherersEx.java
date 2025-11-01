import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Gatherer;

//Gatherer<T,A,R>
/* T - o tipo dos elementos de entrada
 * A - o estado intermediário usado durante o processamento
 * R - o tipo dos elementos de saída
 * */
class ComparaProdutos implements Gatherer<String, String, String> {

    private final String produto;

    public ComparaProdutos(String produto) {
        this.produto = produto;
    }

    /*
     * Função para criar o estado inicial (A).
     * 
     * Supplier é uma interface funncional c/ um método (get) retorna String
     */
    @Override
    public Supplier<String> initializer() {
        return () -> "";
    }
    
    /*
     * Função para processar um elemento de entrada (T), 
     * atualizar o estado (A) e
     * enviar elementos na downstream (R) - saída.
     * 
     * Integrator é uma interface funcional c/ um método (integrate) retorna bool
     */
    @Override
    public Integrator<String, String, String> integrator() {
    	return (estado, elemento, downstream) -> {
            if (estado.isEmpty()) { //Estado inicial é vazio
            	estado = elemento;
            }
            
            if (elemento.contains(produto)) { //Elemento contém o produto
                downstream.push(estado); //Insere o estado corrente no downstream
            }
            
            return true; // Continua o processamento
        };
    }
}

public class GatherersEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listaProdutos = new ArrayList<>();
		
		listaProdutos.add("Geladeira 470L");
		listaProdutos.add("TV UHD 50''");
		listaProdutos.add("TV UHD 65''");
		listaProdutos.add("Microondas 20L");
		listaProdutos.add("Geladeira 120L");
		listaProdutos.add("Computador i5 2.9Ghz 4GB 1TB HD");
		listaProdutos.add("Geladeira 500L");
		
		//Method references 
		//listaProdutos.stream().forEach(System.out::println);

		//Agrupar elementos de 2 em 2
		//listaProdutos.stream().gather(Gatherers.windowFixed(2)).forEach(System.out::println);
		
		ComparaProdutos cp = new ComparaProdutos("TV");
		listaProdutos.stream().gather(cp).forEach(System.out::println);
		
	}
}
