package com.example.gomes.restwithspringandjavaerudio.service;

import com.example.gomes.restwithspringandjavaerudio.dto.Mapper.CalculadoraMapper;
import com.example.gomes.restwithspringandjavaerudio.model.CalculadoraModel;
import org.springframework.stereotype.Service;


@Service
public class CalculadoraService {

    public Double somar(String numberOne, String numberTwo){
        CalculadoraModel model = new CalculadoraModel();

        model.setNumberOne(numberOne);
        model.setNumberTwo(numberTwo);

        String message = "a soma dos numeros é: ";

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) + CalculadoraMapper.toNumber(model.getNumberTwo());

        System.out.println(message + result);

        return result;

    }

    public Double dividir(String numberOne, String numberTwo){
        CalculadoraModel model = new CalculadoraModel();

        model.setNumberOne(numberOne);
        model.setNumberTwo(numberTwo);

        String message = "a divisão dos numeros é: ";

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) / CalculadoraMapper.toNumber(model.getNumberTwo());

        System.out.println(message + result);

        return result;

    }

    public Double multiplicar(String numberOne, String numberTwo){
        CalculadoraModel model = new CalculadoraModel();

        model.setNumberOne(numberOne);
        model.setNumberTwo(numberTwo);

        String message = "a multificação dos numeros é: ";

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) * CalculadoraMapper.toNumber(model.getNumberTwo());

        System.out.println(message + result);

        return result;

    }

    public Double subtracao(String numberOne, String numberTwo){
        CalculadoraModel model = new CalculadoraModel();

        model.setNumberOne(numberOne);
        model.setNumberTwo(numberTwo);

        String message = "a subtracao dos numeros é: ";

        Double result = CalculadoraMapper.toNumber(model.getNumberOne()) - CalculadoraMapper.toNumber(model.getNumberTwo());

        System.out.println(message + result);

        return result;

    }

    public Double media(String numberOne, String numberTwo, String media){

        return this.somar(numberOne,numberTwo) / CalculadoraMapper.toNumber(media);

    }

}
