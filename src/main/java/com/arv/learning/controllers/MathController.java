package com.arv.learning.controllers;

import com.arv.learning.exceptions.UnsupportedMathOperationsException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static com.arv.learning.utils.MathControllerUtils.convertToDouble;
import static com.arv.learning.utils.MathControllerUtils.isNumeric;

@RestController
public class MathController {

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationsException("please set a numeric value");
        }

        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    @GetMapping("/multi/{numberOne}/{numberTwo}")
    public Double multi(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationsException("please set a numeric value");
        }

        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    @GetMapping("/div/{numberOne}/{numberTwo}")
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationsException("please set a numeric value");
        }

        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    @GetMapping("/avg/{numberOne}/{numberTwo}")
    public Double avg(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationsException("please set a numeric value");
        }

        return convertToDouble(numberOne) + convertToDouble(numberTwo) / 2;
    }

    @GetMapping("/sqrt/{number}")
    public Double sqrt(
            @PathVariable(value = "number") String number
    ) {
        if (!isNumeric(number)) {
            throw new UnsupportedMathOperationsException("please set a numeric value");
        }

        return Math.sqrt(convertToDouble(number));
    }
}
