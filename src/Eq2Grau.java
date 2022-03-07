
public class Eq2Grau {
	double a, b, c;
	
	Eq2Grau(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
		
		if(a==0) {
			System.out.println("Não é uma equação de 2°grau");
			System.exit(0);
		}
	}
	
	double delta() {
		return Math.pow(b, 2)-4*a*c;
	}
	
	double raiz1() {
		return (-b + Math.sqrt(delta()))/ 2*a;
		
	}
	
	double raiz2() {
		return (-b - Math.sqrt(delta()))/ 2*a;
	}
}
