
public class Lampada {
	boolean estadoLampada;
	int quantidadeClick;
	
	Lampada(boolean estadoLampada, int quantidadeClick){
		this.estadoLampada = estadoLampada;
		this.quantidadeClick = quantidadeClick;
	}
	
	void clickInterruptor(){
		quantidadeClick++;
		verificaQuantitadeClick();
		System.out.println(quantidadeClick);
		
		if(estadoLampada) {
			estadoLampada = false;
			System.out.println("Desligou");
		}else {
			estadoLampada = true;
			System.out.println("Ligou");
		}
	}
	
	void verificaQuantitadeClick() {
		if(quantidadeClick > 5) {
			System.out.println("A lampada parou de funcionar\n");
			estadoLampada = false;
			System.exit(0);
		}
	}
	
}
