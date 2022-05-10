package views;

import utils.Console;

public class Principal {
	
	public static void main(String[] args){
		
		int opcao = 0;
		
		Cadastro cadastro = new Cadastro();
		Lista lista = new Lista();
		
		do{
			System.out.printf("%n"+
			"+----------------------------------+ %n"+
			"| [1] Cadastrar Colaborador        | %n"+
			"| [2] Lista de Colaboradores       | %n"+
			"| [3] Cadastrar Folha de Pagamento | %n"+
			"| [4] Consultar Folha de Pagamento | %n"+
			"| [5] Consultar Fodas as Folhas    | %n"+
			"| [0] Encerrar                     | %n"+
			"+----------------------------------+ %n");
			
			System.out.println();
			opcao = Console.readInt("Digite uma opção: ");
			
			switch (opcao){
			
				case 1:
					cadastro.cadastrarFuncionario();
					break;
					
				case 2:
					lista.listarFuncionario();
					break;
				
				case 3:
					cadastro.cadastrarPagamento();
					break;
				
				case 4:
					lista.listarPagamento();
					break;
					
				case 5:
					
					break;
				
				case 0:
					System.out.println("\n--ENCERRANDO--\n");
					break;
				
				default:
					System.out.println("\n--OPÇÃO INVÁLIDA--\n");
					break;	
			}
		}while(opcao != 0);
	}
}