package Exercicio2;

public class RodarExercicio2 {

	public static void main(String[]args){
		String nome;
		double salario;
		
		Exercicio2 rodar = new Exercicio2();
		
	nome=rodar.Nome();
	salario=rodar.Salario();
	rodar.Calculo(salario, nome);
	}
}
