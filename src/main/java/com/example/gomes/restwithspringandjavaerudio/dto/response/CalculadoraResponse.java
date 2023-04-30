package com.example.gomes.restwithspringandjavaerudio.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalculadoraResponse {

    private String numberOne;
    private String numberTwo;
    private double result;


}
