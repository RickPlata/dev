package com.microservicios.curso.login.component;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@Data
@RefreshScope
public class ApiValues {

    @Value("${session.ttl}")
    private Long sessionTtl;

}
