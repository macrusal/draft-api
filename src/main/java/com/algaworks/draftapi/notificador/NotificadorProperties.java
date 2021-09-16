package com.algaworks.draftapi.notificador;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author macrusal on 16/09/21
 * @project draft-api
 */
@Component
@ConfigurationProperties("notificador.email")
public class NotificadorProperties {

    /**
     * Host do servidor de email
     */
    private String hostServidor;

    /**
     * Porta do servidor de email
     */
    private Integer portaServidor;

    /**
     * Gets hostServidor
     *
     * @return value of hostServidor
     */
    public String getHostServidor() {
        return hostServidor;
    }

    /**
     * Sets hostServidor
     */
    public void setHostServidor( String hostServidor ) {
        this.hostServidor = hostServidor;
    }

    /**
     * Gets portaServidor
     *
     * @return value of portaServidor
     */
    public Integer getPortaServidor() {
        return portaServidor;
    }

    /**
     * Sets portaServidor
     */
    public void setPortaServidor( Integer portaServidor ) {
        this.portaServidor = portaServidor;
    }
}
