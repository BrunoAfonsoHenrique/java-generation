package Turma22;

public class TesteFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fornecedor felipe = new Fornecedor("Felipe","Rua Pascoal,222","23456789012",98883322,18,25000,10000);
		
		felipe.imprimirInfo();
		felipe.validarCpf();
		felipe.obterSaldo();
	}

}
