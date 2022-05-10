package views;

import controllers.FuncionarioController;
import controllers.PagamentoController;
import models.Funcionario;
import models.FolhaPagamento;
import utils.Console;

public class Cadastro {

    public void cadastrarFuncionario(){
    	
        Funcionario funcionario = new Funcionario();        
        FuncionarioController funcionarioController = new FuncionarioController();
        System.out.println("\n--CADASTRO DE COLABORADORES--\n");
        funcionario.setNome(Console.readString("Digite o NOME do Colaborador: "));
        funcionario.setCpf(Console.readString("Digite o CPF do Colaborador: "));        
        funcionarioController.cadastrar(funcionario);
        System.out.println("\n--COLABORADOR CADASTRADO--\n");
    }
    
    public void cadastrarPagamento(){
        
        System.out.println("\n--CADASTRO FOLHA DE PAGAMENTO--\n");

        FolhaPagamento pagamento = new FolhaPagamento(); 
        
        PagamentoController pagamentoController = new PagamentoController();
        FuncionarioController funcionarioController = new FuncionarioController();
        
        String cpfFuncionario = Console.readString("Digite o CPF do colaborador: ");
        Funcionario funcionario = funcionarioController.buscarCpf(cpfFuncionario);
        
        if (funcionario !=null){
        	
        	System.out.println("\n--CADASTRO DE FOLHA DE PAGAMENTO--\n");
            pagamento.setMes(Console.readInt("Informe o mês: "));
            pagamento.setAno(Console.readInt("Informe o ano: "));
            pagamento.setHorasTrabalhadas(Console.readInt("Informe as horas trabalhadas: "));
            pagamento.setValorHora(Console.readDouble("Informe o valor da hora: "));
        
        	pagamentoController.cadastrar(pagamento);
        	
            System.out.println("\n--PAGAMENTO CADASTRADO--\n");
     
        }else{
            System.out.println("Funcionário não encontrado!");
        }
    }
    
}