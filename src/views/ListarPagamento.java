package views;

import controllers.PagamentoController;
import models.Pagamento;

public class ListarPagamento {

	public void render(){
        PagamentoController pagamentoController = new PagamentoController();      
        System.out.println("\n--LISTA DE PAGAMENTOS--\n");
        for (Pagamento pagamentoCadastrado : pagamentoController.listar()) {
            System.out.println(pagamentoCadastrado);
        }
    }
}
