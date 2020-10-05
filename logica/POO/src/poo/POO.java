
package poo;

import java.text.DecimalFormat;

public class POO {

    public static void main(String[] args) {
        Perimetros perimetro = new Perimetros();
        Areas area = new Areas();
        Conversiones conversiones = new Conversiones();
        DecimalFormat formato = new DecimalFormat("###,###.##");
        double radio=5;
        double valor= 10000;
        
        System.out.println("PERIMETROS");
        System.out.println("el perímetro del circulo es "+perimetro.hallarCirculo(radio));
        System.out.println("el perimetro del cuadrado es "+perimetro.hallarCuadrado(4));
        System.out.println("el perimetro del rectangulo es "+perimetro.hallarRectangulo(4,2));
        
        System.out.println("\nAREAS");
        System.out.println("el área del circulo es "+area.hallarCirculo(radio));
        System.out.println("el área del cuadrado es "+area.hallarCuadrado(4));
        System.out.println("el área del rectangulo es "+area.hallarRectangulo(4,2));
        
        System.out.println("\nCONVERSIONES");
        System.out.println("En pesos colombianos "+valor);
        System.out.println("En dolares estadounidenses "+formato.format(conversiones.convertirDolares(valor)));
        System.out.println("En Euros "+formato.format(conversiones.convertirEuros(valor)));
        System.out.println("En reales de Brasil "+formato.format(conversiones.convertirReales(valor)));
        System.out.println("En Rupias de India "+formato.format(conversiones.convertirRupias(valor)));
        
    }
    
}
