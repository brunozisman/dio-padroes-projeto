package com.dio.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepAPI;

public class Facade {

    public void MigrarCliente(String nome, String cep)
    {
        String cidade  = CepAPI.getInstancia().RecuperarCidade(cep);
        String estado  = CepAPI.getInstancia().RecuperarEstado(cep);

        CrmService.GravarCliente(nome, cep, cidade, estado);
    }
}
