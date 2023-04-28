package com.example.gomes.restwithspringandjavaerudio.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculadoraRequest {

    private String numberOne;
    private String numberTwo;
}
