
public class Porta {
	boolean isOpen;
	static int numAberturas;
	
	Porta(boolean isOpen){
		
		this.isOpen = isOpen;
		
		if(isOpen) {
			numAberturas++;
		}else if(numAberturas == 0){
			System.out.println("Todas as portas j� est�o fechadas\n");
		}else {
			numAberturas--;
		}
	}
	
	void abrir(){
		if(isOpen) {
			System.out.println("Essa porta ja est� aberta");
		}else {
			isOpen = true;
			numAberturas++;
			System.out.println("Abrindo...");
		}
	}
	
	void fechar() {
		if(!isOpen) {
			System.out.println("Essa porta ja est� fechada");
		}else {
			isOpen = false;
			numAberturas--;
			System.out.println("Fechando...");
		}
	}
	
	void mostrar() {
		System.out.println("Total de portas abertas: " + numAberturas + "\n");
	}
}
