package com.algaworks.draftapi.listener;

import com.algaworks.draftapi.event.ClienteAtivadoEvent;
import com.algaworks.draftapi.notificador.NivelUrgencia;
import com.algaworks.draftapi.notificador.Notificador;
import com.algaworks.draftapi.notificador.TipoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author macrusal on 02/09/21
 * @project draft-api
 */
@Component
public class NotificacaoService {

    @TipoNotificador( NivelUrgencia.NORMMAL )
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener( ClienteAtivadoEvent event ) {
        notificador.notificar( event.getCliente(), "Seu cadastro no sistema está ativo" );
    }
}
