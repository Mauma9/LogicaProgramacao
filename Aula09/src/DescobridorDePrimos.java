
public class DescobridorDePrimos {
	public static void main(String[] args) {
		long candidato =0;
		while(true) {
			boolean ehPrimo = true;
			candidato++;
			
			for (long i = 2 ; i < candidato ; i++) {
				if (candidato % i == 0) {
					ehPrimo = false;
				}
			}
			if (ehPrimo) {
				System.out.println(candidato);
			}
		}
	}
}
