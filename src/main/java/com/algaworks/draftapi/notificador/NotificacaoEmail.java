package com.algaworks.draftapi.notificador;

import com.algaworks.draftapi.modelo.Cliente;
import org.springframework.stereotype.Component;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */

public class NotificacaoEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSMTP;

    public NotificacaoEmail(String hostServidorSMTP) {
        this.hostServidorSMTP = hostServidorSMTP;
        System.out.println("NotificacaoEmail");
    }

    @Override
    public void notificar( Cliente cliente, String mensagem ) {
        if(this.caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificação enviada para o cliente %s através do e-mail %s, servidor SMTP %s : %s \n",
                cliente.getNome(), cliente.getEmail(), this.hostServidorSMTP, mensagem);
    }

    /**
     * Sets caixaAlta
     */
    public void setCaixaAlta( boolean caixaAlta ) {
        this.caixaAlta = caixaAlta;
    }
}
