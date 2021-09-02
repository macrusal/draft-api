package com.algaworks.draftapi.listener;

import com.algaworks.draftapi.event.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author macrusal on 02/09/21
 * @project draft-api
 */
@Component
public class EmissaoTicketService {


    @EventListener
    public void clienteAtivadoListener( ClienteAtivadoEvent event ) {
        System.out.println("Emitindo ticket para o convidado "+ event.getCliente().getNome());
    }
}
