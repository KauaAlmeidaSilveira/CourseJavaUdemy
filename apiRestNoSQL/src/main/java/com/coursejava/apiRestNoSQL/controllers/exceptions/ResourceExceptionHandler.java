package com.coursejava.apiRestNoSQL.controllers.exceptions;

import com.coursejava.apiRestNoSQL.services.exceptions.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StantardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        StantardError stantardError = new StantardError(Instant.now(), status.value(),"Not Found", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(stantardError);
    }

}
