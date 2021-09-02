package com.algaworks.draftapi.service;

import com.algaworks.draftapi.modelo.Cliente;
import com.algaworks.draftapi.notificador.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author macrusal on 31/08/21
 * @project exemplo-injecao-dependencia
 */
@Component
public class AtivacaoClienteService {

    @Autowired
    private List<Notificador> notificadores;

    public void ativar( Cliente cliente ) {
        cliente.ativar();

        for( Notificador notificador: notificadores ) {
            notificador.notificar(cliente, "Cadastro ativado com sucesso!");
        }
    }
}
