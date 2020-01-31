package com.cra.webservices.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {


    public ResourceNotFoundException(Object id) {
        super("Resource not foud. Id " + id);
    }
}
