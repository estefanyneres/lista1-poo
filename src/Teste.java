
public class Teste {

	public static void main(String[] args) {
		//ex 1.1
		Pessoa dadosPessoa = new Pessoa("Fulana", Sexo.FEMININO, 5, true);
		dadosPessoa.mostrarPessoa();
		
		Churrasco quantidade = new Churrasco();
		quantidade.verificarConsumo(dadosPessoa);
		quantidade.mostrarQuantidade();
		
		//ex 1.2
		Lampada l = new Lampada(false,0);
		l.clickInterruptor();
		l.clickInterruptor();
		l.clickInterruptor();
		l.clickInterruptor();
		l.clickInterruptor();
		l.clickInterruptor();
		
		//ex 1.3
		Complexo c1 = new Complexo(5, 2);
		Complexo c2 = new Complexo(3, 4);
		Complexo c = new Complexo();
		
		System.out.print("1º Número: ");
		c1.mostrar();
		System.out.print("2º Número: ");
		c2.mostrar();
		
		c = c1.soma(c2);	
		System.out.print("Soma: ");
		c.mostrar();
		
		c = c1.multiplica(c2);
		System.out.print("Multiplicação: ");
		c.mostrar();
		
		System.out.println("Notação Complexa: " + c.toString());;
		
		System.out.print("Modulo do 1º número: ");
		System.out.printf("%.2f\n", c1.modulo());
		System.out.print("Modulo do 2º número: ");
		System.out.printf("%.2f\n", c2.modulo());
		
		System.out.print("Argumento Principal do 1º número: ");
		System.out.printf("%.2f\n", c1.argumentoPrincipal());
		System.out.print("Argumento Principal do 2º número: ");
		System.out.printf("%.2f\n", c2.argumentoPrincipal());
		
		//ex 1.4
		Triangulo t = new Triangulo(4);
		System.out.println("Area: " + t.calcArea());
		System.out.println("Perimetro: " + t.calcPerimetro());
		
		//ex 1.5
		Jogo j = new Jogo();
		j.simular();
		
		//ex 1.6 
		Eq2Grau resultado = new Eq2Grau(1,-1,-12);
		System.out.println("Delta: " + resultado.delta());
		System.out.println("Raiz 1: " + resultado.raiz1());
		System.out.println("Raiz 2: " + resultado.raiz2());
		
		//ex 1.7
		Porta total = new Porta(false);
		total.fechar();
		total.abrir();
		total.mostrar();
		
		Porta total2 = new Porta(true);
		total2.abrir();
		total2.mostrar();
		total2.fechar();
		total2.mostrar();
		
	}

}
