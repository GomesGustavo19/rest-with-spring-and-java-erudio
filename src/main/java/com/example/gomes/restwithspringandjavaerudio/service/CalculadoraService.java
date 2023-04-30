package com.example.gomes.restwithspringandjavaerudio.service;

import com.example.gomes.restwithspringandjavaerudio.dto.Mapper.CalculadoraMapper;
import com.example.gomes.restwithspringandjavaerudio.model.CalculadoraMediaModel;
import com.example.gomes.restwithspringandjavaerudio.model.CalculadoraModel;
import org.springframework.stereotype.Service;


@Service
public class CalculadoraService {

    public CalculadoraModel somar(CalculadoraModel model) {

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) + CalculadoraMapper.toNumber(model.getNumberTwo());

        model.setResult(result);

        return model;

    }

    public Double dividir(String numberOne, String numberTwo) {
        CalculadoraModel model = new CalculadoraModel();

        model.setNumberOne(numberOne);
        model.setNumberTwo(numberTwo);

        String message = "a divisão dos numeros é: ";

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) / CalculadoraMapper.toNumber(model.getNumberTwo());

        System.out.println(message + result);

        return result;

    }

    public Double multiplicar(String numberOne, String numberTwo) {
        CalculadoraModel model = new CalculadoraModel();

        model.setNumberOne(numberOne);
        model.setNumberTwo(numberTwo);

        String message = "a multificação dos numeros é: ";

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) * CalculadoraMapper.toNumber(model.getNumberTwo());

        System.out.println(message + result);

        return result;

    }

    public Double subtracao(String numberOne, String numberTwo) {
        CalculadoraModel model = new CalculadoraModel();

        model.setNumberOne(numberOne);
        model.setNumberTwo(numberTwo);

        String message = "a subtracao dos numeros é: ";

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) - CalculadoraMapper.toNumber(model.getNumberTwo());

        System.out.println(message + result);

        return result;

    }

    public CalculadoraMediaModel media(String numberOne, String numberTwo, String media) {

        CalculadoraMediaModel model = new CalculadoraMediaModel();

        model.setNumberOne(numberOne);
        model.setNumberTwo(numberTwo);

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) + CalculadoraMapper.toNumber(model.getNumberTwo()) / CalculadoraMapper.toNumber(media);
        model.setResult(result);

        System.out.println(model.getResult());

        return model;

    }

    public Double RaizQuadrada(String numberOne) {

        return Math.sqrt(CalculadoraMapper.toNumber(numberOne));

    }

}
