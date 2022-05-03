package views;

import controllers.FuncionarioController;
import models.Funcionario;
import utils.Console;

public class CadastrarFuncionario {

    public void render(){
    	
        Funcionario funcionario = new Funcionario();        
        FuncionarioController funcionarioController = new FuncionarioController();
        System.out.println("\n--CADASTRO DE COLABORADORES--\n");
        funcionario.setNome(Console.readString("Digite o NOME do Colaborador: "));
        funcionario.setCpf(Console.readString("Digite o CPF do Colaborador: "));        
        funcionarioController.cadastrar(funcionario);
        System.out.println("\n--COLABORADOR CADASTRADO--\n");
    }
    
}