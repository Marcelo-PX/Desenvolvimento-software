package views;

import utils.Console;
import controllers.PagamentoController;
import controllers.FuncionarioController;
import models.Funcionario;
import models.Pagamento;

public class CadastrarPagamento {

    public void render(){
    
        System.out.println("\n--CADASTRO FOLHA DE PAGAMENTO--\n");

        Pagamento pagamento = new Pagamento(); 
        
        PagamentoController pagamentoController = new PagamentoController();
        FuncionarioController funcionarioController = new FuncionarioController();
        
        String cpfFuncionario = Console.readString("Digite o CPF do colaborador: ");
        Funcionario funcionario = funcionarioController.buscarCpf(cpfFuncionario);
        
        if (funcionario !=null){
        	
        	System.out.println("\n--CADASTRO DE FOLHA DE PAGAMENTO--\n");
            pagamento.setPagamento(Console.readString("Informe o pagamento: "));
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
