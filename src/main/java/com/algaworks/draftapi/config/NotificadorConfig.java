package com.algaworks.draftapi.config;

import com.algaworks.draftapi.notificador.NotificacaoEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author macrusal on 31/08/21
 * @project draft-api
 */
@Configuration
public class NotificadorConfig {

    @Bean
    public NotificacaoEmail notificacaoEmail() {
        NotificacaoEmail notificacaoEmail = new NotificacaoEmail( "draft-api.smtpmail.com.br" );
        notificacaoEmail.setCaixaAlta( true );

        return notificacaoEmail;
    }
}
