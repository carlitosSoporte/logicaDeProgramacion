
package ejerciciospropuestos;
import java.util.Scanner;

public class Ejerciciospropuestos {

    
    public static void main(String[] args) {
        
        //calcularGanancia();
        //calcularSueldoTotal();
        //calcularPrecioFinal();
        //calcularNotaFinal();
        //calcularPorcentajeSexos();
        //calcularEdad();
    }
    
    
    public static  void calcularGanancia(){
        
        /*1) Suponga que un individuo desea invertir su capital en un banco y desea saber cuanto
        dinero ganara después de un mes si el banco paga a razón de 2% mensual.
        Inicio
        Leer cap_inv
       gan = cap_inv * 0.02
       Imprimir gan
       Fin*/
        
        Scanner teclado = new Scanner(System.in);
        double capitalInvertido, gananciaMensual;
        System.out.print("ingrese el capital a invertir: ");
        capitalInvertido = teclado.nextDouble();
        
        gananciaMensual = capitalInvertido * 0.02; 
        
        System.out.println("su ganancia mensual sería "+gananciaMensual);

    }
    
    public static void calcularSueldoTotal(){
        /*2) Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el
        vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres
        ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo
         base y comisiones.
        Inicio
        Leer sb, v1, v2, v3
        tot_vta = v1 + v2 + v3
        com = tot_vta * 0.10
        tpag = sb + com
        Imprimir tpag, com
        Fin*/
        Scanner teclado = new Scanner(System.in);
        double salarioBase, valorVenta1, valorVenta2, valorVenta3, comision, totalPagado, totalVentas;
        
        System.out.println("ingrese su salario base: ");
        salarioBase = teclado.nextDouble();
        
        System.out.println("ingrese el valor de su primera venta: ");
        valorVenta1 =teclado.nextDouble();
        
        System.out.println("ingrese el valor de su segunda venta: ");
        valorVenta2 = teclado.nextDouble();
        
        System.out.println("ingrese el valor de su tercera venta:");
        valorVenta3 = teclado.nextDouble();
        
        totalVentas = valorVenta1 + valorVenta2 + valorVenta3;
        comision= totalVentas * 0.10;
        totalPagado = salarioBase + comision;
        
        System.out.println("su sueldo total fue "+totalPagado+" y su comision fue de "+comision);
        
        
    }
    
    public static void  calcularPrecioFinal(){
        
        /*3) Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea
        saber cuanto deberá pagar finalmente por su compra.
        Inicio
        Leer tc
        d = tc * 0.15
        tp = tc - d
        Imprimir tp
        Fin */
        Scanner teclado = new Scanner(System.in);
        
        double totalCompra, totalPagado, descuento;
        
        System.out.println("ingrese el total de la compra: ");
        totalCompra = teclado.nextDouble();
        
        descuento = totalCompra * 0.15;
        totalPagado =totalCompra - descuento;
        
        System.out.println("su total a pagar es "+totalPagado);
                
    }
    
    public static void calcularNotaFinal(){
        
        /*4) Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha
        calificación se compone de los siguientes porcentajes:
        55% del promedio de sus tres calificaciones parciales.
        30% de la calificación del examen final.
        15% de la calificación de un trabajo final.
        Inicio
        Leer c1, c2, c3, ef, tf
        prom = (c1 + c2 + c3)/3
        ppar = prom * 0.55
        pef = ef * 0.30
        ptf = tf * 0.15
        cf = ppar + pef + ptf
        Imprimir cf
        Fin */
        
        Scanner teclado = new Scanner(System.in);
        
        double calificacion1, calificacion2, calificacion3,examenFinal, trabajoFinal;
        double NotaFinal, promedioCalificaciones, porcentajeCalificaciones;
        double porcentajeExamenFinal, porcentajeTrabajoFinal;
        
        System.out.println("ingrese la primer calificacion: ");
        calificacion1 = teclado.nextFloat();
        
        System.out.println("ingrese su segunda calificacion: ");
        calificacion2 = teclado.nextFloat();
        
        System.out.println("ingrese su tercera calificacion: ");
        calificacion3 = teclado.nextFloat();
        
        System.out.println("ingrese la nota de su examen final; ");
        examenFinal = teclado.nextFloat();
        
        System.out.println("ingrese la nota de su trabajo final: ");
        trabajoFinal = teclado.nextFloat();
        
        promedioCalificaciones = (calificacion1 + calificacion2 + calificacion3) / 3;
        
        porcentajeCalificaciones = promedioCalificaciones * 0.55;
        porcentajeExamenFinal = examenFinal * 0.3;
        porcentajeTrabajoFinal = trabajoFinal * 0.15;
        
        NotaFinal = porcentajeCalificaciones + porcentajeTrabajoFinal + porcentajeExamenFinal;
        
        System.out.println("su nota final es "+NotaFinal);
    }
    
    public static void calcularPorcentajeSexos(){
        /*5) Un maestro desea saber que porcentaje de hombres y que porcentaje de mujeres hay en
        un grupo de estudiantes.
        Inicio
        Leer nh, nm
        ta = nh + nm
        ph = nh * 100 / ta
        pm = nm * 100 / ta
        Imprimir ph, pm
        Fin */
        Scanner teclado = new Scanner(System.in);
        
        int numeroHombres, numeroMujeres, cantidadTotal;
        double porcentajeHombres, porcentajeMujeres;
        
        System.out.println("ingrese el número de hombres: ");
        numeroHombres = teclado.nextInt();
        
        System.out.println("ingrese el número de mujeres: ");
        numeroMujeres = teclado.nextInt();
        
        cantidadTotal = numeroMujeres + numeroHombres;
        porcentajeHombres = numeroHombres * 100 / cantidadTotal;
        porcentajeMujeres = numeroMujeres * 100 / cantidadTotal;
        
        System.out.println("el porcentaje de mujeres es: "+porcentajeMujeres+  " %");
        System.out.println("el porcentaje de hombres es: "+porcentajeHombres + " %");
    }
    
    public static void calcularEdad(){
        /* 6) Realizar un algoritmo que calcule la edad de una persona.
        Inicio
        Leer fnac, fact
        edad = fact - fnac
        Imprimir edad
        Fin. */
        Scanner teclado = new Scanner(System.in);
        
        int fechaActual, fechaNacimiento, edad;
        
        System.out.println("ingrese el año actual: ");
        fechaActual = teclado.nextInt();
        
        System.out.println("ingrese su año de nacimiento: ");
        fechaNacimiento = teclado.nextInt();
        
        edad = fechaActual -fechaNacimiento;
        
        System.out.println("su edad es: " + edad);
        
    }
}
