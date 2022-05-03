package views;

import controllers.FuncionarioController;
import models.Funcionario;

public class ListarFuncionarios {

    public void render(){
    	
        FuncionarioController funcionarioController = new FuncionarioController(); 
        System.out.println("\n--LISTA DE COLABORADORES--\n");
        for (Funcionario funcionarioCadastrado : funcionarioController.listar()) {
            System.out.println(funcionarioCadastrado);
        }
    }
}