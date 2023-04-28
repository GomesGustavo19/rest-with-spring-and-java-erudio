package com.example.gomes.restwithspringandjavaerudio.dto.Mapper;

import com.example.gomes.restwithspringandjavaerudio.dto.request.CalculadoraRequest;
import com.example.gomes.restwithspringandjavaerudio.dto.response.CalculadoraResponse;
import com.example.gomes.restwithspringandjavaerudio.exception.UnsupportedCaracterMathException;
import com.example.gomes.restwithspringandjavaerudio.model.CalculadoraModel;

import java.util.regex.Pattern;

public class CalculadoraMapper {

    public static double toNumber(String strRequest) {

        if (strRequest == null) return 0D;

        if (isLetter(strRequest) != null) {
            String number = strRequest.replaceAll(",", ".");
            if (isNumeric(number)) return Double.parseDouble(number);
        }

        return 0D;
    }

    private static String isLetter(String strRequest) {
        boolean regex = strRequest.matches("^[a-zA-Z]*$");
        if (regex){
            throw new UnsupportedCaracterMathException("Somente numero, por favor digite um numero valaido(0-9): ");
        }

        return strRequest;

    }


    private static boolean isNumeric(String strRequest) {

        if (strRequest == null) return false;

        return strRequest.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static CalculadoraResponse toCalculadoraResponse(CalculadoraModel model) {
        CalculadoraResponse response = new CalculadoraResponse();

        response.setNumberOne(model.getNumberOne());
        response.setNumberOne(model.getNumberTwo());

        return response;

    }

    public static CalculadoraModel toCalculadora(CalculadoraRequest request) {
        CalculadoraModel model = new CalculadoraModel();

        model.setNumberOne(request.getNumberOne());
        model.setNumberTwo(request.getNumberTwo());

        return model;

    }

}
