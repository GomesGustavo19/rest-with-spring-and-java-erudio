package com.example.gomes.restwithspringandjavaerudio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedCaracterMathException extends RuntimeException{

    public UnsupportedCaracterMathException(String ex){
        super(ex);
    }
}
