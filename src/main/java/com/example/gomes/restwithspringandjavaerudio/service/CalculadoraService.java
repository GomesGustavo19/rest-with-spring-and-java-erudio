package com.example.gomes.restwithspringandjavaerudio.service;

import com.example.gomes.restwithspringandjavaerudio.dto.Mapper.CalculadoraMapper;
import com.example.gomes.restwithspringandjavaerudio.model.CalculadoraMediaModel;
import com.example.gomes.restwithspringandjavaerudio.model.CalculadoraModel;
import com.example.gomes.restwithspringandjavaerudio.model.CalculadoraRaizModel;
import org.springframework.stereotype.Service;


@Service
public class CalculadoraService {

    public CalculadoraModel somar(CalculadoraModel model) {

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) + CalculadoraMapper.toNumber(model.getNumberTwo());
        model.setResult(result);

        return model;

    }

    public CalculadoraModel dividir(CalculadoraModel model) {

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) / CalculadoraMapper.toNumber(model.getNumberTwo());
        model.setResult(result);

        return model;

    }

    public CalculadoraModel multiplicar(CalculadoraModel model) {

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) * CalculadoraMapper.toNumber(model.getNumberTwo());
        model.setResult(result);

        return model;

    }

    public CalculadoraModel subtracao(CalculadoraModel model) {

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) - CalculadoraMapper.toNumber(model.getNumberTwo());
        model.setResult(result);

        return model;

    }

    public CalculadoraMediaModel media(CalculadoraMediaModel model) {

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) + CalculadoraMapper.toNumber(model.getNumberTwo()) / CalculadoraMapper.toNumber(model.getMedia());
        model.setResult(result);

        return model;

    }

    public CalculadoraRaizModel raiz(CalculadoraRaizModel model) {

       Double result = Math.sqrt(CalculadoraMapper.toNumber(model.getNumberOne()));

       model.setResult(result);

       return model;



    }

}
