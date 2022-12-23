package com.devsuperior.dscommerce.entities.services.exceptions;

public class ForbiddenException extends RuntimeException {
    public ForbiddenException(String msg){
        super(msg);
    }
}
