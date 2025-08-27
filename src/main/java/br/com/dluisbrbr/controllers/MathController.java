package br.com.dluisbrbr.controllers;

import br.com.dluisbrbr.exception.UnsupportedMathOperationException;
import br.com.dluisbrbr.math.SimpleMath;
import br.com.dluisbrbr.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    SimpleMath math = new SimpleMath();

    @RequestMapping("/sum/{numberone}/{numbertwo}")
    public Double sum(
            @PathVariable("numberone") String numberone,
            @PathVariable("numbertwo") String numbertwo
    )
    {
        if (!NumberConverter.isNumeric(numberone) || !NumberConverter.isNumeric(numbertwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.sum(NumberConverter.covertToDouble(numberone) , NumberConverter.covertToDouble(numbertwo));
    }

    @RequestMapping("/subtraction/{numberone}/{numbertwo}")
    public Double subtraction(
            @PathVariable("numberone") String numberone,
            @PathVariable("numbertwo") String numbertwo
    )
    {
        if (!NumberConverter.isNumeric(numberone) || !NumberConverter.isNumeric(numbertwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.subtraction(NumberConverter.covertToDouble(numberone) , NumberConverter.covertToDouble(numbertwo));
    }

    @RequestMapping("/multiply/{numberone}/{numbertwo}")
    public Double multiply(
            @PathVariable("numberone") String numberone,
            @PathVariable("numbertwo") String numbertwo
    )
    {
        if (!NumberConverter.isNumeric(numberone) || !NumberConverter.isNumeric(numbertwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.multiply( NumberConverter.covertToDouble(numberone) , NumberConverter.covertToDouble(numbertwo));
    }

    @RequestMapping("/divide/{numberone}/{numbertwo}")
    public Double divide(
            @PathVariable("numberone") String numberone,
            @PathVariable("numbertwo") String numbertwo
    )
    {
        if (!NumberConverter.isNumeric(numberone) || !NumberConverter.isNumeric(numbertwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.divide( NumberConverter.covertToDouble(numberone) , NumberConverter.covertToDouble(numbertwo));
    }

    @RequestMapping("/mean/{numberone}/{numbertwo}")
    public Double mean(
            @PathVariable("numberone") String numberone,
            @PathVariable("numbertwo") String numbertwo
    )
    {
        if (!NumberConverter.isNumeric(numberone) || !NumberConverter.isNumeric(numbertwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.mean(NumberConverter.covertToDouble(numberone) , NumberConverter.covertToDouble(numbertwo));
    }
}
