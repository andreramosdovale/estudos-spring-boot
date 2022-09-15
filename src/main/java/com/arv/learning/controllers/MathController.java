package com.arv.learning.controllers;

import com.arv.learning.exceptions.UnsupportedMathOperationsException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

    private Double convertToDouble(String value) {
        if (value == null) return 0D;
        String valueChecked = fixCurrency(value);
        if (isNumeric(valueChecked)) return Double.parseDouble(valueChecked);

        return 0D;
    }

    private boolean isNumeric(String value) {
        if (value == null) return false;
        String valueChecked = fixCurrency(value);

        return valueChecked.matches("[+-]?[0-9]*\\.?[0-9]+");
    }

    private String fixCurrency(String value) {
        return value.replaceAll(",", ".");
    }
}
