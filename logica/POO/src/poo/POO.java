
package poo;

public class POO {

    public static void main(String[] args) {
        Perimetros perimetro = new Perimetros();
        double radio=5;
        System.out.println("el perímetro del circulo es "+perimetro.hallarCirculo(radio));
        System.out.println("el perimetro del cuadrado es "+perimetro.hallarCuadrado(4));
        System.out.println("el perimetro del rectangulo es "+perimetro.hallarRectangulo(2, 4));
        
    }
    
}
