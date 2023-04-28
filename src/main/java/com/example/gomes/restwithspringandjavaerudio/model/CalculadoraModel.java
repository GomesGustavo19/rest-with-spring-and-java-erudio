package com.example.gomes.restwithspringandjavaerudio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.message.StringFormattedMessage;

import java.sql.Struct;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalculadoraModel {

    private String numberOne;
    private String numberTwo;


}
