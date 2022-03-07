
public class Churrasco {
	double qtdCarne;
	
	void verificarConsumo(Pessoa pessoa) {
		if(pessoa.vegetariana) {
			qtdCarne = 0;
			return;
		}
		if(pessoa.idade >=0 && pessoa.idade <=3) {
			qtdCarne = 0;
		}
		else if(pessoa.idade <=12){
			qtdCarne = 1;
		}
		else {
			qtdCarne = 2;
		}
		
	}
	
	void mostrarQuantidade() {
		System.out.println("Quantidade consumida: " + qtdCarne + " Kg");
	}
}
