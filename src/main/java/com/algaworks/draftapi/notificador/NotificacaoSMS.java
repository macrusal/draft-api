package com.algaworks.draftapi.notificador;

import com.algaworks.draftapi.modelo.Cliente;
import org.springframework.stereotype.Component;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
@Component
public class NotificacaoSMS implements Notificador {

    @Override
    public void notificar( Cliente cliente, String mensagem ) {
        System.out.printf("Notificação enviada, o cliente %s receberá o SMS através do telefone %s: %s \n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
