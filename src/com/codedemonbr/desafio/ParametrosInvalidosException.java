package com.codedemonbr.desafio;

public class ParametrosInvalidosException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = -5355680207260699110L;

    private String nomeAtributo;

    public ParametrosInvalidosException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public ParametrosInvalidosException() {
        this.nomeAtributo = "O segundo parâmetro deve ser maior que o primeiro";
    }

    public String getMessage() {
        return nomeAtributo;
    }
}
