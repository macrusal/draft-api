package com.algaworks.draftapi.service;

import com.algaworks.draftapi.event.ClienteAtivadoEvent;
import com.algaworks.draftapi.modelo.Cliente;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
@Component
public class AtivacaoClienteService {

    private ApplicationEventPublisher eventPublisher;

    public AtivacaoClienteService( ApplicationEventPublisher eventPublisher ) {
        this.eventPublisher = eventPublisher;
    }

    public void ativar( Cliente cliente ) {
        cliente.ativar();

        eventPublisher.publishEvent( new ClienteAtivadoEvent(cliente) );
    }
}
