package com.example.gomes.restwithspringandjavaerudio.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class ExceptionResponse implements Serializable {

    private Date timestemp;
    private String menssage;
    private String details;

}
