package com.algaworks.draftapi.config;

import com.algaworks.draftapi.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author macrusal on 02/09/21
 * @project draft-api
 */
@Configuration
public class ServiceConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public AtivacaoClienteService ativaClienteService() {
        return new AtivacaoClienteService();
    }
}
