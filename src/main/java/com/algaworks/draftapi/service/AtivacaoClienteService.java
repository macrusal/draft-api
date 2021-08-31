package com.algaworks.draftapi.service;

import com.algaworks.draftapi.modelo.Cliente;
import com.algaworks.draftapi.notificador.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
@Component
public class AtivacaoClienteService {

    @Autowired
    private Notificador notificador;

//    public AtivacaoClienteService() {
//    }
//
//    @Autowired
//    public AtivacaoClienteService( Notificador notificador ) {
//        this.notificador = notificador;
//    }

    public void ativar( Cliente cliente ) {
        cliente.ativar();
        this.notificador.notificar(cliente, "Cadastro ativado com sucesso!");
    }

    /**
     * Sets notificador
     */
//    @Autowired
//    public void setNotificador( Notificador notificador ) {
//        this.notificador = notificador;
//    }
}
