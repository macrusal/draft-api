package com.algaworks.draftapi.notificador;

import com.algaworks.draftapi.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */

@Profile( "prod" )
@TipoNotificador( NivelUrgencia.NORMMAL )
@Component
public class NotificacaoEmail implements Notificador {

    public NotificacaoEmail() {
        System.out.println("Notificador email produção");
    }

    @Override
    public void notificar( Cliente cliente, String mensagem ) {

        System.out.printf("Notificação enviada para o cliente %s através do e-mail %s: %s \n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
