package com.uk.springbootcrud.exception;

public class NoDepartmentDataException extends RuntimeException {
    public NoDepartmentDataException(String msg){
        super(msg);
    }
}
