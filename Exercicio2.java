package Exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public String Nome(){
		String nome =JOptionPane.showInputDialog(null, "Digite o nome do funcionário");
		return nome;
	}
	public double Salario(){
		double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do salário do funcionário:"));
		return salario;
	}
	
	public void Calculo(double salario, String nome){
		if(salario>=2500){
			double inss= salario*0.08;
			double alimentacao= salario*0.05;
			double transporte= salario*0.06;
			double salarioFinal= salario-inss-alimentacao-transporte;
			JOptionPane.showMessageDialog(null, "Funcionário: "+nome +"\n Salário bruto: R$"+salario+"\n Inss  8%  R$"+inss+"\n Vale Alimentação  5%  R$"+alimentacao+"\n Vale Transporte  6%  R$"+transporte+"\n Salário Final: R$"+salarioFinal );
		}
		else{
			double inss= salario*0.04;
			double alimentacao=salario*0.03;
			double transporte= salario*0.02;
			double salarioFinal= salario-inss-alimentacao-transporte;
			JOptionPane.showMessageDialog(null, "Funcionário: "+nome +"\n Salário bruto: R$"+salario+"\n Inss  4%  R$"+inss+"\n Vale Alimentação  3%  R$"+alimentacao+"\n Vale Transporte  2%  R$"+transporte+"\n Salário Final: R$"+salarioFinal );
		}
	}

}
