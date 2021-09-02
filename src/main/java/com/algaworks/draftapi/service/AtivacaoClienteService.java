package com.algaworks.draftapi.service;

import com.algaworks.draftapi.modelo.Cliente;
import com.algaworks.draftapi.notificador.NivelUrgencia;
import com.algaworks.draftapi.notificador.Notificador;
import com.algaworks.draftapi.notificador.TipoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
@Component
public class AtivacaoClienteService {

    @TipoNotificador( NivelUrgencia.NORMMAL )
    @Autowired
    private Notificador notificador;

//    @PostConstruct
    public void init() {
        System.out.println("INIT " + notificador);
    }

//    @PreDestroy
    public void destroy() {
        System.out.println("DESTROY ");
    }

    public void ativar( Cliente cliente ) {
        cliente.ativar();

        this.notificador.notificar(cliente, "Cadastro ativado com sucesso!");
    }
}
