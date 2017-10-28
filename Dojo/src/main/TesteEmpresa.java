package main;

public class TesteEmpresa {

	public static void main(String[] args) {
		
		Empresa empresaFicticia = new Empresa();
		
		Funcionario f1 = new Funcionario("Driko", 50000);
		Funcionario f2 = new Funcionario("Messi", 2000);
		Funcionario f3 = new Funcionario("Ninja", 199);
		
		empresaFicticia.contrata(f1);
		empresaFicticia.contrata(f2);
		System.out.println("Funcionarios ativos: \n" +empresaFicticia.mostraFuncionarios());
		empresaFicticia.contrata(f3);
		System.out.println("Funcionarios ativos: \n" +empresaFicticia.mostraFuncionarios());
		empresaFicticia.demite(f1);
		System.out.println("Funcionarios ativos: \n" +empresaFicticia.mostraFuncionarios());

	}

}
