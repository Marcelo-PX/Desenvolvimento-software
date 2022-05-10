package views;

import controllers.FuncionarioController;
import controllers.PagamentoController;
import models.Funcionario;
import models.FolhaPagamento;

public class Lista {

    public void listarFuncionario(){
    	
        FuncionarioController funcionarioController = new FuncionarioController(); 
        System.out.println("\n--LISTA DE COLABORADORES--\n");
        for (Funcionario funcionarioCadastrado : funcionarioController.listar()) {
            System.out.println(funcionarioCadastrado);
        }
    }
    
    public void listarPagamento(){
        PagamentoController pagamentoController = new PagamentoController();      
        System.out.println("\n--LISTA DE PAGAMENTOS--\n");
        for (FolhaPagamento pagamentoCadastrado : pagamentoController.listar()) {
            System.out.println(pagamentoCadastrado);
        }
    }
    
}