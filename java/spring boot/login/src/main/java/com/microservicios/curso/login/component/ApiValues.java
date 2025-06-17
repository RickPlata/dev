package com.microservicios.curso.login.component;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ApiValues {

    @Value("${session.ttl}")
    private Long sessionTtl;

    private ApiValues() {}
}
