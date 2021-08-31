package com.algaworks.draftapi.notificador;

import com.algaworks.draftapi.modelo.Cliente;

/**
 * @author macrusal on 31/08/21
 * @project draft-api
 */
public interface Notificador {

    void notificar( Cliente cliente, String mensagem );
}
