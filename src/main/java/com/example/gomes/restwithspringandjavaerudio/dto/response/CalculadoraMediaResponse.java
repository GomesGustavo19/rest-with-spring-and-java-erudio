package com.example.gomes.restwithspringandjavaerudio.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculadoraMediaResponse {

    private String numberOne;
    private String numberTwo;
    private String Media;
    private double result;



}
