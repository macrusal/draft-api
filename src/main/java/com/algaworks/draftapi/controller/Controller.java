package com.algaworks.draftapi.controller;

import com.algaworks.draftapi.modelo.Cliente;
import com.algaworks.draftapi.service.AtivacaoClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author macrusal on 31/08/21
 * @project draft-api
 */
@org.springframework.stereotype.Controller
public class Controller {

    private AtivacaoClienteService ativacaoClienteService;

    public Controller( AtivacaoClienteService ativacaoClienteService ) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente marcelo = new Cliente( "Marcelo", "marcelo@email.com", "11-90001-0001" );
        ativacaoClienteService.ativar( marcelo );
        return "Hello!";
    }
}
