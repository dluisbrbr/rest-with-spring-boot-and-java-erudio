package br.com.dluisbrbr.math;

import br.com.dluisbrbr.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {

    public Double sum(Double numberone,Double numbertwo)
    {
        return numberone + numbertwo;
    }

    public Double subtraction(Double numberone,Double numbertwo)
    {
        return numberone - numbertwo;
    }

    public Double multiply(Double numberone,Double numbertwo)
    {
        return numberone * numbertwo;
    }

    public Double divide(Double numberone,Double numbertwo)
    {
        return numberone / numbertwo;
    }

    public Double mean(Double numberone,Double numbertwo)
    {
        return (numberone + numbertwo) / 2;
    }

}
