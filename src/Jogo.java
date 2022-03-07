
public class Jogo {
	
	int  sorteado;
	
	void sortear(int tentativa) {
		
		sorteado = (int) (Math.random() * 100);
		
		if(tentativa == sorteado) {
			System.out.println("\nParabens, voce adivinhou o numero.");
			System.out.println("Tentativa foi: " + tentativa);
			System.out.println("Sorteado foi: " + sorteado + "\n");
		}
		else {
			System.out.println("Erro! Ainda não é o numero sorteado");
		}
	}
	
	
	void simular() {
		this.sortear(18);
		this.sortear(27);
		this.sortear(42);
		this.sortear(35);
		this.sortear(63);
		this.sortear(52);
		this.sortear(98);
	}
}


