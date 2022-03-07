
public class Complexo {
	
	double a, b;
	
	//default constructor
	Complexo(){}	

	Complexo(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	void mostrar() {
		System.out.printf("(%.2f, %.2f)\n", a , b);
	}
	
	Complexo soma(Complexo c) {
		Complexo result = new Complexo();
		result.a = a + c.a;
		result.b = b + c.b;
		return result;
	}
	
	Complexo multiplica(Complexo c) {
		Complexo result = new Complexo();
		result.a = (a*c.a) - (b*c.b);
		result.b = (a*c.b) + (b*c.a);
		return result;
	}
	
   	public String toString() {
        	return a + "+" + b + "i";
    	}
    
    	double modulo(){
        	return Math.sqrt((a*a)+(b*b));	
    	}

    	double argumentoPrincipal() {
		return Math.atan(b/a);
    	}
}