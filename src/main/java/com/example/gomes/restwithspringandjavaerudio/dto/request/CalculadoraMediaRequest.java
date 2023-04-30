package com.example.gomes.restwithspringandjavaerudio.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalculadoraMediaRequest {

    private String numberOne;
    private String numberTwo;
    private String media;
    private double result;
}
