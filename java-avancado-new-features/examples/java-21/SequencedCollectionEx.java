import java.util.LinkedHashSet;
import java.util.SequencedCollection;

public class SequencedCollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SequencedCollection<String> cestaDeFrutas = new LinkedHashSet<>();
		
		cestaDeFrutas.add("Banana");
		cestaDeFrutas.add("Laranja");
		cestaDeFrutas.add("Abacaxi");
		cestaDeFrutas.add("Maça");
		
		for(String fruta : cestaDeFrutas) {
			System.out.println(fruta);
		}
	}

}
