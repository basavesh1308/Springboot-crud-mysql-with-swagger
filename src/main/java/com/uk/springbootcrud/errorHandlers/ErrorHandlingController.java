package com.uk.springbootcrud.errorHandlers;

import com.uk.springbootcrud.AppConstants;
import com.uk.springbootcrud.dto.DepartmentResponseDTO;
import com.uk.springbootcrud.exception.NoDepartmentDataException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlingController {

    @ExceptionHandler(NoDepartmentDataException.class)
    public ResponseEntity<Object> noDepartmentDataException(NoDepartmentDataException e){
        return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
