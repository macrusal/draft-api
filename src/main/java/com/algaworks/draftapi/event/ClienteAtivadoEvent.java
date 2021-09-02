package com.algaworks.draftapi.event;

import com.algaworks.draftapi.modelo.Cliente;

/**
 * @author macrusal on 02/09/21
 * @project draft-api
 */
public class ClienteAtivadoEvent {

    private Cliente cliente;

    public ClienteAtivadoEvent( Cliente cliente ) {
        this.cliente = cliente;
    }

    /**
     * Gets cliente
     *
     * @return value of cliente
     */
    public Cliente getCliente() {
        return cliente;
    }
}
