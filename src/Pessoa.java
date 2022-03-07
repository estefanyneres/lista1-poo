
public class Pessoa {
	String nome;
	Sexo sexo;
	int idade;
	boolean vegetariana;
	
	
	Pessoa(String nome, Sexo sexo, int idade, boolean vegetariana){
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.vegetariana = vegetariana;
	}
	
	void mostrarPessoa() {
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
		if(vegetariana) {
			System.out.println("Vegetariana: Sim");
		}else {
			System.out.println("Vegetariana: Não");
		}
	}
}
