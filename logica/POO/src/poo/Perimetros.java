
package poo;

public class Perimetros {
    double perimetro;
    
    public double hallarCirculo(double radio){
        perimetro = 2 * radio * Math.PI;
        return perimetro;
    }
    
    public double hallarCuadrado(double lado){
        perimetro = lado * 4;
        return perimetro;
    }
    
    public double hallarRectangulo(double largo, double ancho){
        perimetro =2 * (largo +ancho);
        return perimetro;
    }
}
