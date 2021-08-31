package com.algaworks.draftapi.modelo;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
public class Cliente {

    private String nome;
    private String email;
    private String telefone;
    private boolean ativo = true;

    public Cliente( String nome, String email, String telefone ) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
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
     * Sets nome
     */
    public void setNome( String nome ) {
        this.nome = nome;
    }

    /**
     * Gets email
     *
     * @return value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email
     */
    public void setEmail( String email ) {
        this.email = email;
    }

    /**
     * Gets telefone
     *
     * @return value of telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Sets telefone
     */
    public void setTelefone( String telefone ) {
        this.telefone = telefone;
    }

    /**
     * Gets ativo
     *
     * @return value of ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Sets ativo
     */
    public void ativar(  ) {
        this.ativo = true;
    }
}
