package com.algaworks.draftapi.notificador;

import com.algaworks.draftapi.modelo.Cliente;
import org.springframework.stereotype.Component;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
@Component
public class NotificacaoEmail implements Notificador {

    public NotificacaoEmail() {
        System.out.println("NotificacaoEmail");
    }

    @Override
    public void notificar( Cliente cliente, String mensagem ) {
        System.out.printf("Notificação enviada para o cliente %s através do e-mail %s: %s \n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
