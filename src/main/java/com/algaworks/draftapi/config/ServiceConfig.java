package com.algaworks.draftapi.config;

import com.algaworks.draftapi.notificador.Notificador;
import com.algaworks.draftapi.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author macrusal on 31/08/21
 * @project draft-api
 */
@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService( Notificador notificador ) {
        return new AtivacaoClienteService( notificador );
    }
}
