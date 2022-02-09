package com.company.subsistema2.cep;

import com.company.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Teresina";
    }

    public String recuperarEstado(String cep) {
        return "PI";
    }

}
