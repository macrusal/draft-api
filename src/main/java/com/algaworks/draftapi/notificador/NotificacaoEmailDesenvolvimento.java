package com.algaworks.draftapi.notificador;

import com.algaworks.draftapi.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */

@Profile( "prod" )
@TipoNotificador( NivelUrgencia.NORMMAL )
@Component
public class NotificacaoEmailDesenvolvimento implements Notificador {

    @Autowired
    NotificadorProperties properties;

    public NotificacaoEmailDesenvolvimento() {
        System.out.println("Notificador email desenvolvimento");
    }

    @Override
    public void notificar( Cliente cliente, String mensagem ) {

        System.out.printf("DEVELOP - Notificação seria enviada para o cliente %s através do e-mail %s: %s \n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
