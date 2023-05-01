package com.example.gomes.restwithspringandjavaerudio.controller;

import com.example.gomes.restwithspringandjavaerudio.dto.Mapper.CalculadoraMapper;
import com.example.gomes.restwithspringandjavaerudio.dto.request.CalculadoraMediaRequest;
import com.example.gomes.restwithspringandjavaerudio.dto.request.CalculadoraRaizRequest;
import com.example.gomes.restwithspringandjavaerudio.dto.request.CalculadoraRequest;
import com.example.gomes.restwithspringandjavaerudio.dto.response.CalculadoraMediaResponse;
import com.example.gomes.restwithspringandjavaerudio.dto.response.CalculadoraRaizResponse;
import com.example.gomes.restwithspringandjavaerudio.dto.response.CalculadoraResponse;
import com.example.gomes.restwithspringandjavaerudio.model.CalculadoraMediaModel;
import com.example.gomes.restwithspringandjavaerudio.model.CalculadoraModel;
import com.example.gomes.restwithspringandjavaerudio.model.CalculadoraRaizModel;
import com.example.gomes.restwithspringandjavaerudio.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService service;

    @GetMapping(value = "soma")
    public CalculadoraResponse soma(@RequestBody CalculadoraRequest request) {

        CalculadoraModel model = CalculadoraMapper.toCalculadora(request);
        CalculadoraModel modelCalculado = service.somar(model);
        CalculadoraResponse response = CalculadoraMapper.toCalculadoraResponse(modelCalculado);

        return response;

    }

    @GetMapping(value = "dividir")
    public CalculadoraResponse dividir(@RequestBody CalculadoraRequest request) {

        CalculadoraModel model = CalculadoraMapper.toCalculadora(request);
        CalculadoraModel modelDividido = service.dividir(model);
        CalculadoraResponse response = CalculadoraMapper.toCalculadoraResponse(modelDividido);

        return response;

    }

    @GetMapping(value = "media")
    public CalculadoraMediaResponse media(@RequestBody CalculadoraMediaRequest request) {

        CalculadoraMediaModel model = CalculadoraMapper.toCalculadoraMedia(request);
        CalculadoraMediaModel modelMedia = service.media(model);
        CalculadoraMediaResponse response = CalculadoraMapper.toCalculadoraMediaResponse(modelMedia);

        return response;

    }

    @GetMapping(value = "raiz")
    public CalculadoraRaizResponse raizquadrada(@RequestBody CalculadoraRaizRequest request) {

        CalculadoraRaizModel model = CalculadoraMapper.toCalculadoraRaiz(request);
        CalculadoraRaizModel modelRaiz = service.raiz(model);
        CalculadoraRaizResponse response = CalculadoraMapper.toCalculadoraRaizResponse(modelRaiz);

        return response;

    }


}
