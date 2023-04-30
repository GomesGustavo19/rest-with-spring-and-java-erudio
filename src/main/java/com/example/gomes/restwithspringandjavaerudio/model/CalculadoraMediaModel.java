package com.example.gomes.restwithspringandjavaerudio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculadoraMediaModel {

    private String numberOne;
    private String numberTwo;
    private String media;
    private double result;


}
