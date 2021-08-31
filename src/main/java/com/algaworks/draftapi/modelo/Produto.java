package com.algaworks.draftapi.modelo;

import java.math.BigDecimal;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
public class Produto {

    private String nome;
    private BigDecimal valorTotal;

    public Produto( String nome, BigDecimal valorTotal ) {
        super();
        this.nome = nome;
        this.valorTotal = valorTotal;
    }

    /**
     * Gets nome
     *
     * @return value of nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Gets valorTotal
     *
     * @return value of valorTotal
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
}
