package com.algaworks.draftapi.service;

import com.algaworks.draftapi.modelo.Cliente;
import com.algaworks.draftapi.notificador.Notificador;
import org.springframework.stereotype.Component;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService( Notificador notificador ) {
        this.notificador = notificador;
        System.out.println("AtivacaoClienteService - " + notificador);
    }

    public void ativar( Cliente cliente ) {
        cliente.ativar();
        this.notificador.notificar(cliente, "Cadastro ativado com sucesso!");
    }
}
