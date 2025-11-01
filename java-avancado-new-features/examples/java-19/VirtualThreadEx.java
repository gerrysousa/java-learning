
public class VirtualThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Thread t = Thread.ofVirtual().start(() -> System.out.println("Olá eu sou uma virtual thread"));
		
			t.join();
			
			System.out.println("Até logo!");
		}
		catch(Exception e) {
			
		}
	}

}
