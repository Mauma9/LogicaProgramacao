
public class NumeroPerfeito {
	public static void main(String[] args) {
		//variaveis
		int candidato =0;
		int somaDivisores = 0;
		//processamento
		while(true) {
			candidato++;
			somaDivisores = 0;
			for (int i = 1; i <= (candidato/2) ; i++) {
				if((candidato % i)== 0) {
					somaDivisores += i;
				}
			}
			if (candidato == somaDivisores) {
				System.out.println(candidato);
			}
		}
	}
}
