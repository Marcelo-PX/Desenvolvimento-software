package controllers;

import java.util.ArrayList;
import models.FolhaPagamento;

public class PagamentoController {

    private static ArrayList<FolhaPagamento> folhas = new ArrayList<FolhaPagamento>();

    public void cadastrar(FolhaPagamento pagamento) {
        folhas.add(pagamento);
    }

    public ArrayList<FolhaPagamento> listar() {
        return folhas;
    }
    
}