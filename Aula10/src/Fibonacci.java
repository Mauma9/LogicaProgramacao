import java.nio.file.spi.FileSystemProvider;

public class Fibonacci {
	public static void main(String[] args) {
		//Variaveis
		double anterior =1;
		double atual =1;
		double futuro =0;
		//processamento
		System.out.println(anterior);
		System.out.println(atual);
		while(true) {
			futuro = (anterior + atual);
			System.out.println(futuro);
			anterior = atual ;
			atual = futuro;
			try {Thread.sleep(1000);} catch(Exception e){}
		}
		
	}
}
