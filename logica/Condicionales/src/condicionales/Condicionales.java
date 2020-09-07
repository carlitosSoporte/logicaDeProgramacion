
package condicionales;
import java.util.Scanner;
public class Condicionales {

    public static void main(String[] args) {
        
     
    }
    
    public static void determinarPositivoNegativo(){
        Scanner teclado = new Scanner(System.in);
        int n;
        
        System.out.println("ingrese un numero a evaluar: ");
        n = teclado.nextInt();
        
        
        if(n>0){
            System.out.println("este numero es positivo");
        }
        else{
            if(n==0){
                System.out.println("el cero es neutro");
            }
            else{
                System.out.println("este numero es negativo");
            }
        }
    }
    
    public static void determinarParImpar(){
        Scanner teclado = new Scanner(System.in);
        int n;
        
        System.out.println("ingrese un numero a evaluar: ");
        n = teclado.nextInt();
        
        if( n % 2 ==0 ){
            System.out.println("es un número par");
        }
        else{
            System.out.println("es un número impar");
        }
    }
    
    public static void determinarMultiplo(){
        Scanner teclado = new Scanner(System.in);
        int n, multiplo;
        
        System.out.println("ingrese un numero a evaluar: ");
        n = teclado.nextInt();
        
        System.out.println("ingrese el multiplo: ");
        multiplo = teclado.nextInt();
        
        if(n % multiplo == 0){
            System.out.println(n+ " es multiplo de "+multiplo);
        }
        else{
            System.out.println(n+ " no es multiplo de "+multiplo);
        }
    }
    
    public static void conocerIntereses(){
        Scanner teclado = new Scanner(System.in);
        
        double capital, porcentajeInteres, dineroTotal, intereses;
        
        System.out.println("ingrese el capital a invertir: ");
        capital = teclado.nextDouble();
        
        System.out.println("ingrese el porcentaje de interes: ");
        porcentajeInteres = teclado.nextDouble();
        
        intereses = capital * (porcentajeInteres/100);
        dineroTotal = capital + intereses;
        
        if(intereses > 7000){
            System.out.println("los interes cumplen la expectativa, usted tendrá en su cuenta:"+dineroTotal);
        }
        else{
            System.out.println("los intereses no cumplen las expectativas");
        }     
    }
    
    public static void aprobarCurso(){
        
        Scanner teclado = new Scanner(System.in);
        
        double calificacion1, calificacion2, calificacion3, promedio;
        
        System.out.println("ingrese la primera calificación: ");
        calificacion1 = teclado.nextDouble();
        
        System.out.println("ingrese la segunda calificación: ");
        calificacion2 = teclado.nextDouble();
        
        System.out.println("ingrese la tercera calificación: ");
        calificacion3 = teclado.nextDouble();
        
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        
        if(promedio >= 70){
            System.out.println("Alumno aprobado");
        }
        else{
            System.out.println("Alumno repronado");
        }
    }
    
    public static void determinarDescuento(){
        Scanner teclado = new Scanner(System.in);
        
        double valorCompra;
        
        System.out.println("ingrese el valor de la compra:");
        valorCompra = teclado.nextDouble();
        
        if(valorCompra > 1000){
            valorCompra= valorCompra * 0.8;
            System.out.println("tiene derecho a descuento, usted sólo pagará "+valorCompra);
        }
        else{
            System.out.println("no tiene derecho a descuento, usted debe pagar "+valorCompra);
        }
    }
    
    public static void calcularSalarioSemanal(){

        Scanner teclado = new Scanner(System.in);
        int horasTrabajadas;
        double salarioSemanal;
        
        System.out.println("ingrese la cantidad de horas trabajadas:");
        horasTrabajadas = teclado.nextInt();
        
        if(horasTrabajadas > 40){
            salarioSemanal = (40 * 16) + ((horasTrabajadas-40)*20);
        }
        else{
            salarioSemanal = horasTrabajadas * 16;
        }
        
        System.out.println("su salario semanal es "+ salarioSemanal);
    }
    
    public static void calcularCalorias(){
        Scanner teclado = new Scanner(System.in);
        String actividad, comparar;
        int tiempo;
        double caloriasQuemadas;
        
        
        System.out.print("ingrese dormido o sentado :");
        actividad = teclado.next();
        
        System.out.println("ingrese la cantidad de minutos que realiza la actividad:");
        tiempo = teclado.nextInt();
        
        if(actividad.equals("dormido")){
            
            caloriasQuemadas = 1.08 * tiempo;
        }
        else{
            caloriasQuemadas = 1.66 * tiempo;
        }
        
        System.out.println("las calorias quemadas durante que esta "+actividad+" son "+caloriasQuemadas);
 
    }
    
    public static void imprimirAscendente(){
        Scanner teclado = new Scanner(System.in);
        
        double numero1, numero2;
        
        System.out.println("ingrese el primer número: ");
        numero1 = teclado.nextDouble();
        
        System.out.println("ingrese el segundo número:");
        numero2 = teclado.nextDouble();
        
        if(numero1<numero2){
            System.out.println("el orden ascendente es "+numero1+" , "+numero2);
        }
        else{
            System.out.println("el orden ascendente es "+numero2+" , "+numero1);
        }
    }
    
    //CLASE CONDICIONALES ANIDADOS
    public static void ejercicio1(){

        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, resultado;
        
        System.out.println("ingrese el primer número:");
        numero1 = teclado.nextInt();
        
        System.out.println("ingrese el segundo número:");
        numero2 = teclado.nextInt();
        
        if(numero1 == numero2){
            resultado = numero1 * numero2;
            System.out.println(numero1 + " * "+numero2+" = "+resultado);
        }
        else{
            if(numero1 > numero2){
                resultado = numero1 - numero2;
                System.out.println(numero1 + " - "+numero2+" = "+resultado);
            }
            else{
                resultado = numero1 + numero2;
                System.out.println(numero1 + " + "+numero2+" = "+resultado);
            }
        }
    }
    
    public static void ejercicio2(){
        Scanner teclado = new Scanner(System.in);
        int numero1,numero2,numero3,mayor;
        
        System.out.println("ingrese el numero 1:");
        numero1= teclado.nextInt();
        
        System.out.println("ingrese el numero 2:");
        numero2= teclado.nextInt();
        
        System.out.println("ingrese el numero 3:");
        numero3= teclado.nextInt();
        
        if((numero1>numero2) && (numero1>numero3)){
            System.out.println("el numero mayor es "+numero1);
        }
        else{
            if((numero2>numero1) && (numero2>numero3)){
                System.out.println("el numero mayor es "+numero2);
            }
            else{
                System.out.println("el numero mayor es "+numero3);
            }
        }
        
    }
    
    public static void ejercicio3(){
        Scanner teclado = new Scanner(System.in);
        int horasTrabajadas, horasExtra;
        double pagoHora, pagoTotalExtra;
        
        System.out.println("ingrese la cantidad de horas trabajadas: ");
        horasTrabajadas = teclado.nextInt();
        
        System.out.println("ingrese el valor de pago por hora:");
        pagoHora = teclado.nextDouble();
        
        if(horasTrabajadas <= 40){
            System.out.println("Usted no trabajó horas extra.");
        }
        else{
            horasExtra= horasTrabajadas - 40;
            if(horasExtra<=8){
                pagoTotalExtra= horasExtra * pagoHora * 2;
            }
            else{
                pagoTotalExtra = (8 * pagoHora * 2)+ ((horasExtra - 8) * pagoHora * 3);
            }
            System.out.println("usted laboró "+horasExtra+" horas extra.");
            System.out.println("recibira por concepto de horas extra un valor de "+pagoTotalExtra);
        }
    }
    
    public static void ejercicio4(){

        Scanner teclado = new Scanner(System.in);
        double salarioMensual, utilidad;
        int antiguedad;
        
        System.out.println("ingrese su salario mensual:");
        salarioMensual = teclado.nextDouble();
        
        System.out.println("ingrese su antiguedad en la empresa expresada en años:");
        antiguedad = teclado.nextInt();
        
        if(antiguedad<1){
            utilidad = salarioMensual * 0.05;
        }
        else{
            if(antiguedad >= 1 && antiguedad < 2){
                utilidad = salarioMensual * 0.07;
            }
            else{
                if(antiguedad >= 2 && antiguedad < 5){
                    utilidad = salarioMensual * 0.1;
                }
                else{
                    if(antiguedad >=5 && antiguedad < 10){
                        utilidad = salarioMensual * 0.15;
                    }
                    else{
                        utilidad = salarioMensual * 0.2;
                    }
                }
            }
        }
        
        System.out.println("en el reparto anual usted recibirá "+utilidad);
        System.out.println("debido a que usted tiene "+antiguedad+ " años de antiguedad");
    }
    
    public static void ejercicio5(){

        Scanner teclado = new Scanner(System.in);
        String colorBolita;
       double valorCompra, totalPagar;
       
        System.out.println("ingrese 'blanco'. 'verde', 'amarilla', 'azul' o 'roja' segun sea el caso:");
        colorBolita = teclado.next();
        
        System.out.println("ingrese el valor de la compra:");
        valorCompra = teclado.nextDouble();
        
        if(colorBolita.equals("verde")){
            totalPagar = valorCompra * 0.9;
        }
        else{
            if(colorBolita.equals("amarilla")){
                totalPagar = valorCompra * 0.75;
            }
            else{
                if(colorBolita.equals("azul")){
                    totalPagar = valorCompra * 0.5;
                }
                else{
                    if(colorBolita.equals("roja")){
                        totalPagar = 0;
                    }
                    else{
                        totalPagar = valorCompra;
                    }
                }
            }
        }
        
        System.out.println("el valor a pagar es "+totalPagar);
        System.out.println("debido a que sacó una bola de color "+colorBolita);
    }
    
    public static void ejercicio6(){
        /*
        6) El IMSS requiere clasificar a las personas que se jubilaran en el año de 1997. Existen
tres tipos de jubilaciones: por edad, por antigüedad joven y por antigüedad adulta. Las
personas adscritas a la jubilación por edad deben tener 60 años o mas y una antigüedad en
su empleo de menos de 25 años. Las personas adscritas a la jubilación por antigüedad
joven deben tener menos de 60 años y una antigüedad en su empleo de 25 años o mas.
Las personas adscritas a la jubilación por antigüedad adulta deben tener 60 años o
mas y una antigüedad en su empleo de 25 años o mas.
Determinar en que tipo de jubilación, quedara adscrita una persona.
        */
        Scanner teclado = new Scanner(System.in);
        int edadJubilacion, antiguedad;
        
        System.out.println("ingrese su edad al jubilarse:");
        edadJubilacion = teclado.nextInt();
        
        System.out.println("inggrese su antiguedad en la empresa expresada en añoss:");
        antiguedad = teclado.nextInt();
        
        if(edadJubilacion >= 60 && antiguedad<25){
            System.out.println("usted fue jubilado por edad");
        }
        else{
            if(edadJubilacion < 60 && antiguedad>=25){
                System.out.println("usted fue jubilado por antiguedad joven ");
            }
            else{
                if(edadJubilacion >=60 && antiguedad>=25){
                    System.out.println("usted fue jubilado por antiguedad adulta");
                }
                else{
                    System.out.println("no cumple con los criterios de jubilación");
                }
            }
        }
    }
    
    public static void ejercicioPropuesto1(){
        Scanner teclado = new Scanner(System.in);
        int numeroComputadoras,descuento;
        double precioComputadora, totalPagar;
        
        precioComputadora = 11000;
        
        System.out.println("ingrese la cantidad de computadoras a comprar:");
        numeroComputadoras = teclado.nextInt();

        totalPagar = precioComputadora * numeroComputadoras;
        
        if(numeroComputadoras < 5){
            totalPagar *= 0.9;
            descuento = 10;
        }
        else{
            if(numeroComputadoras >= 5 && numeroComputadoras<10){
                totalPagar *= 0.8;
                descuento = 20;
            }
            else{
                if(numeroComputadoras >= 10){
                    totalPagar *= 0.6;
                    descuento = 40;
                }
                else{
                    descuento=0;
                }
            }
        }
        
        if(descuento == 0){
            System.out.println("la cantidad no puede ser cero o negativa");
        }
        else{
            System.out.println("Su descuento será del "+descuento+" %");
            System.out.println("por lo tanto deberá pagar "+totalPagar);
        }
        
        
        
    }
    
    public static void ejercicioPropuesto2(){
        Scanner teclado = new Scanner(System.in);
        
        int cantidadLlantas, precioLlanta;
        double totalPagar;
        
        System.out.println("ingrese la cantidad de llantas a llevar:");
        cantidadLlantas = teclado.nextInt();
        
        if(cantidadLlantas < 5){
            precioLlanta = 300;
        }
        else if(cantidadLlantas >=5 && cantidadLlantas <= 10){
            precioLlanta = 250;
        }
        else{
            precioLlanta = 200;
        }
        
        totalPagar = precioLlanta * cantidadLlantas;
        System.out.println("el precio de cada llanta es de "+precioLlanta);
        System.out.println("usted llevó "+cantidadLlantas);
        System.out.println("deberá pagar en total "+ totalPagar);
    }
    
    public static void ejercicioPropuesto3(){
        Scanner teclado = new Scanner(System.in);

        String opcionUsuario;
        System.out.println("Responda 'si o 'no' según sea el caso");
        System.out.println("1. Colon descubrió América?");
        opcionUsuario = teclado.next();
        
        if(opcionUsuario.equals("si")){
            System.out.println();
            System.out.println("correcto, siguiente pregunta:");
            System.out.println("2. La independencia de México fue en el año 1810?");
            opcionUsuario = teclado.next();
            
            if(opcionUsuario.equals("si")){
                System.out.println();
                System.out.println("segunda pregunta correcta, siguiente pregunta:");
                System.out.println("3. The Doors fue un grupo de rock Americano?");
                opcionUsuario = teclado.next();
                
                if(opcionUsuario.equals("si")){
                    System.out.println("correcto, ha finalizado el juego con satisfación");
                }
                else{
                    System.out.println("ha fallado, el juego finalizó");
                }
            }
            else{
                System.out.println("fallaste, fin del programa");
            }
            
        }
        else{
            System.out.println("fallaste, fin del programa");
        }
    }
    
    public static void ejercicioPropuesto4(){
        Scanner teclado = new Scanner(System.in);
        double precioInicial;
        String marca;
        
        System.out.println("ingrese el precio del aparato:");
        precioInicial = teclado.nextDouble();
        System.out.println("ingrese la marca del aparato:");
        marca = teclado.next();
        
        if(precioInicial > 2000){
            precioInicial *= 0.9;
            if(marca.equals("NOSY")){
                precioInicial *= 0.95;
            }
        }
        
        precioInicial *= 1.19;
        
        System.out.println("su total a pagar con iva incluido es "+precioInicial);
        
        
        
    }
    
    public static void ejercicioPropuesto5(){
        Scanner teclado = new Scanner(System.in);
        double kilosComprados, precioManzanas, precioFinal;
        
        precioFinal = 0;
        System.out.println("ingrese la cantidad de kilos a comprar:");
        kilosComprados = teclado.nextDouble();
        
        System.out.println("ingrese el precio de las manzanas:");
        precioManzanas = teclado.nextDouble();
        
        if(kilosComprados >= 0 && kilosComprados <= 2){
            precioFinal = kilosComprados * precioManzanas;
        }
        else if(kilosComprados >= 2.01 && kilosComprados <= 5){
            precioFinal = kilosComprados * precioManzanas * 0.9;
        }
        else if(kilosComprados >= 5.01 && kilosComprados <= 10){
            precioFinal = kilosComprados * precioManzanas * 0.85;
        }
        else if(kilosComprados > 10){
            precioFinal = kilosComprados * precioManzanas * 0.8;
        }
 
        System.out.println("su total a pagar es " + precioFinal);
        
        
    }
    
    public static void ejercicioPropuesto6(){
        Scanner teclado = new Scanner(System.in);
        
        double capital, porcentajeComputo, porcentajeMoviliario, porcentajePersonal;
        double prestamo;
        
        System.out.println("ingrese su capital actual");
        capital = teclado.nextDouble();
        
        if(capital < 0){
            prestamo = (capital*-1)+ 10000;
            capital = 10000;
        }
        else if(capital > 0  && capital <= 20000){
            prestamo = 20000 - capital;
            capital = 20000;
        }
        else{
            prestamo = 0;
        }
        
        porcentajeComputo = (5000 / capital) * 100;
        porcentajeMoviliario = (2000 / capital) * 100;
        porcentajePersonal = ((capital - 7000) / capital) * 100;
        
        if(prestamo == 0){
            System.out.println("no tuvo que realizar ningún prestamo");
        }
        else{
            System.out.println("tuvo que realizar prestamo por " + prestamo);
        }
        System.out.println("su capital actual es " + capital);
        System.out.println("el porcentaje del capital destinado a Computo es " + porcentajeComputo + " %");
        System.out.println("el porcentaje del capital destinado a Moviliario es " + porcentajeMoviliario+ " %");
        System.out.println("el porcentaje del capital para insumos y empleados es " + porcentajePersonal+ " %");
        
    }
    
    public static void ejercicioPropuesto7(){
        Scanner teclado = new Scanner(System.in);
        
        int edad, sexo, auxiliarEdad;
        double nivelHemoglobina;
        
        System.out.print("ingrese su edad en años:");
        edad = teclado.nextInt();
        
        System.out.print("ingrese '1' para hombre y '2' para mujer: ");
        sexo = teclado.nextInt();
        
        System.out.print("ingrese su nivel de hemoglobina: ");
        nivelHemoglobina = teclado.nextDouble();
        
        if(edad >=0 && edad <=1){
            
            System.out.print("sea expecífico con su edad en meses por favor: ");
            auxiliarEdad = teclado.nextInt();
            
            if(auxiliarEdad >= 0 && auxiliarEdad <= 1){
                
                if(nivelHemoglobina >= 13 && nivelHemoglobina <= 26){
                System.out.println("examen con resultado NEGATIVO");
                }
                else{
                System.out.println("lo sentimos, su resultado ha dado POSITIVO");
                }  
            }
            else if(auxiliarEdad > 1 && auxiliarEdad <=6){
                
                if(nivelHemoglobina >= 10 && nivelHemoglobina <= 18){
                System.out.println("examen con resultado NEGATIVO");
                }
                else{
                System.out.println("lo sentimos, su resultado ha dado POSITIVO");
                } 
            }
            else if(auxiliarEdad > 6 && auxiliarEdad <=12){
                
                if(nivelHemoglobina >= 11 && nivelHemoglobina <= 15){
                System.out.println("examen con resultado NEGATIVO");
                }
                else{
                System.out.println("lo sentimos, su resultado ha dado POSITIVO");
                } 
            }
            else{
                System.out.println("error en los datos suministrados");
            }
  
        }
        else if(edad > 1 && edad <=5){
            
            if(nivelHemoglobina >= 11.5 && nivelHemoglobina <= 15){
                System.out.println("examen con resultado NEGATIVO");
            }
            else{
                System.out.println("lo sentimos, su resultado ha dado POSITIVO");
            } 
        }
        else if(edad > 5 && edad <= 10){
            
            if(nivelHemoglobina >= 12.6 && nivelHemoglobina <= 15.5){
                System.out.println("examen con resultado NEGATIVO");
            }
            else{
                System.out.println("lo sentimos, su resultado ha dado POSITIVO");
            } 
        }
        else if(edad > 10 && edad <= 15){
            
            if(nivelHemoglobina >= 13 && nivelHemoglobina <= 15.5){
                System.out.println("examen con resultado NEGATIVO");
            }
            else{
                System.out.println("lo sentimos, su resultado ha dado POSITIVO");
            } 
        }
        else if(sexo == 1 && edad > 15){
            
            if(nivelHemoglobina >= 12 && nivelHemoglobina <= 16){
                System.out.println("examen con resultado NEGATIVO");
            }
            else{
                System.out.println("lo sentimos, su resultado ha dado POSITIVO");
            } 
        }
        else if(sexo == 2 && edad > 15){
            
            if(nivelHemoglobina >= 14 && nivelHemoglobina <= 18){
                System.out.println("examen con resultado NEGATIVO");
            }
            else{
                System.out.println("lo sentimos, su resultado ha dado POSITIVO");
            } 
        }
    }
    
    public static void ejercicioPropuesto8(){
        Scanner teclado = new Scanner(System.in);
        
        double promedio, totalPagar;
        int nivelAcademico, materiasReprobadas;
        
        
        System.out.print("ingrese '1' para 'preparatoria' y '2' para 'profesional':");
        nivelAcademico = teclado.nextInt();
        
        System.out.print("ingrese su promedio:");
        promedio = teclado.nextDouble();
              
        if(promedio >= 9.5 && nivelAcademico == 1 & promedio <= 10){
            totalPagar = 55 * 180;
            totalPagar *= 0.75;
        }
        else if(promedio >= 9 && promedio < 9.5 && nivelAcademico == 1){
            totalPagar = 50 * 180;
            totalPagar *= 0.9;
        }
        else if(promedio > 7 & promedio < 9 & nivelAcademico == 1){
            totalPagar = 50 * 180;
        }
        else if(promedio <=7 & nivelAcademico == 1){
            System.out.print("ingrese la cantidad de materias reprobadas:");
            materiasReprobadas = teclado.nextInt();
            
            if(materiasReprobadas >=0 & materiasReprobadas <=3){
                totalPagar = 45 * 180;
            }
            else if(materiasReprobadas >=4){
                totalPagar = 40 * 180;
            }else{
                totalPagar = 0;
            }
        }
        else if(promedio >= 9.5 & nivelAcademico == 2 & promedio <= 10){
            totalPagar = 55 * 300;
            totalPagar *= 0.8;
        }
        else if(promedio < 9.5 & nivelAcademico == 2){
            totalPagar = 55 * 300;
        }
        else{
            totalPagar = 0;
        }
        
        System.out.println("su total a pagar es de "+totalPagar);
    }

}
