package com.algaworks.draftapi.notificador;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author macrusal on 02/09/21
 * @project draft-api
 */

@Retention( RetentionPolicy.RUNTIME )
@Qualifier
public @interface TipoNotificador {

    NivelUrgencia value();
}
