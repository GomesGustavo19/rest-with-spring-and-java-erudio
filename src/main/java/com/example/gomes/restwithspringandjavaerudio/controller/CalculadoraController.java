package com.example.gomes.restwithspringandjavaerudio.controller;

import com.example.gomes.restwithspringandjavaerudio.dto.Mapper.CalculadoraMapper;
import com.example.gomes.restwithspringandjavaerudio.dto.request.CalculadoraRequest;
import com.example.gomes.restwithspringandjavaerudio.dto.response.CalculadoraResponse;
import com.example.gomes.restwithspringandjavaerudio.model.CalculadoraMediaModel;
import com.example.gomes.restwithspringandjavaerudio.model.CalculadoraModel;
import com.example.gomes.restwithspringandjavaerudio.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService service;

    @GetMapping(value = "soma")
    public CalculadoraResponse soma(@RequestBody CalculadoraRequest request){

        CalculadoraModel model = CalculadoraMapper.toCalculadora(request);
        CalculadoraModel modelCalculado = service.somar(model);
        CalculadoraResponse response = CalculadoraMapper.toCalculadoraResponse(modelCalculado);

        return response;

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

        CalculadoraMediaModel model = new CalculadoraMediaModel();

        service.media(numberOne, numberTwo, media);

        return model.getResult();

    }

    @GetMapping(value = "raiz")
    public double raizquadrada(@RequestParam(value = "numberOne") String numberOne){

        return service.RaizQuadrada(numberOne);

    }


}
