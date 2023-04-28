package com.example.gomes.restwithspringandjavaerudio.exception.handler;

import com.example.gomes.restwithspringandjavaerudio.exception.ExceptionResponse;
import com.example.gomes.restwithspringandjavaerudio.exception.UnsupportedCaracterMathException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
public class CustomizeUnsupportedCaracterMathException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UnsupportedCaracterMathException.class)
    public final ResponseEntity<ExceptionResponse>  UnsupportedCaracterMathException(Exception ex, WebRequest request){

        ExceptionResponse response = new ExceptionResponse(new Date(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

    }



}
