package Exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {
	double saldo=1500;
	public void SolicitarDados(){
		double opcao = Double.parseDouble(JOptionPane.showInputDialog(null,"Escolha uma das opções: \n 1- Consultar saldo \n 2- Depositar \n 3- Realizar Saque \n 4- Sair"));
		if (opcao==1){
			ConsultarSaldo();
		}
		else if (opcao==2){
			Depositar();
		}
		else if (opcao==3){
			Sacar();
			
		}
		else if (opcao==4){
			System.exit(0);
		}
		else{
			JOptionPane.showMessageDialog(null, "Digite uma opção válida!!!");
		}
	
	}
	
	public void ConsultarSaldo(){
		JOptionPane.showMessageDialog(null, "O seu saldo é de: R$"+saldo);
		
	}
	
public void Depositar(){
	double valorDeposito= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor para depósito:"));
		saldo = saldo+valorDeposito;
		JOptionPane.showMessageDialog(null, "O seu saldo após o depósito é de: R$"+saldo);
		
	}

public void Sacar(){
	double valorSaque= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor que deseja sacar:"));
	if(valorSaque>saldo){
		JOptionPane.showMessageDialog(null, "Impossível realizar um saque maior do que seu saldo");	
	}
	else{
		
	
	saldo = saldo-valorSaque;
	JOptionPane.showMessageDialog(null, "O seu saldo após o saque é de: R$"+saldo);
	}
	
}


	
	

}
