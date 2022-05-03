package controllers;

import java.util.ArrayList;
import models.Pagamento;

public class PagamentoController {

    private static ArrayList<Pagamento> folhas = new ArrayList<Pagamento>();

    public void cadastrar(Pagamento pagamento) {
        folhas.add(pagamento);
    }

    public ArrayList<Pagamento> listar() {
        return folhas;
    }
    
}