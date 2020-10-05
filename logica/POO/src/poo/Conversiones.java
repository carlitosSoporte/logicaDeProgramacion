
package poo;

import java.text.DecimalFormat;

public class Conversiones {
    private double resultado;

    public double convertirDolares(double valor){
        double valorDolar = 3843.06d;
        resultado = valor / valorDolar;
        return resultado;
    }
    
    public double convertirEuros(double valor){
        double valorEuro = 4530.23d;
        resultado = valor / valorEuro;
        return resultado;
    }
    
    public double convertirReales(double valor){
        double valorReal = 684.59d;
        resultado = valor / valorReal;
        return resultado;
    }
    
    public double convertirRupias(double valor){
        double valorRumpia = 52.61d;
        resultado = valor / valorRumpia;
        return resultado;
    }
}
