package com.example.gomes.restwithspringandjavaerudio.controller;

import com.example.gomes.restwithspringandjavaerudio.dto.request.CalculadoraRequest;
import com.example.gomes.restwithspringandjavaerudio.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService service;

    @GetMapping(value = "somar")
    public double somar(@RequestParam(value = "numberOne") String numberOne,
                        @RequestParam(value = "numberTwo") String numberTwo){

        CalculadoraRequest request = new CalculadoraRequest();
        request.setNumberOne(numberOne);
        request.setNumberTwo(numberTwo);

        return service.somar(request.getNumberOne(), request.getNumberTwo());

    }

    @GetMapping(value = "dividir")
    public double dividir(@RequestParam(value = "numberOne") String numberOne,
                          @RequestParam(value = "numberTwo") String numberTwo){

        CalculadoraRequest request = new CalculadoraRequest();
        request.setNumberOne(numberOne);
        request.setNumberTwo(numberTwo);

        return service.dividir(request.getNumberOne(), request.getNumberTwo());

    }

    @GetMapping(value = "media")
    public double media(@RequestParam(value = "numberOne") String numberOne,
                        @RequestParam(value = "numberTwo") String numberTwo,
                        @RequestParam(value = "media") String media){

        return service.media(numberOne, numberTwo, media);

    }


}
