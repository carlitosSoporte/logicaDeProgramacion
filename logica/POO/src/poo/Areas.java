
package poo;

public class Areas {
    
    double resultado;
    
    public double hallarCirculo(double radio){
        resultado = Math.PI * Math.pow(radio, 2);
        return resultado;
    }
    
    public double hallarCuadrado(double lado){
        resultado = lado * lado;
        return resultado;
    }
    
    public double hallarRectangulo(double largo, double ancho){
        resultado = largo * ancho;
        return resultado;
    }
    
}
