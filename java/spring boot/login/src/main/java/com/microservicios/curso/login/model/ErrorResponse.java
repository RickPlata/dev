package com.microservicios.curso.login.model;

import lombok.Data;
import lombok.ToString;

import javax.lang.model.type.ErrorType;

@Data
@ToString
public class ErrorResponse {

    private int code;
    private ErrorType type;
    private String message;
    private String details;
    private String location;

    public void setType(com.microservicios.curso.login.model.ErrorType errorType) {

    }
}
