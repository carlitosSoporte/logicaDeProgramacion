
package cicloswhile;

import java.util.Scanner;

public class CiclosWhile {

    public static void main(String[] args) {
        whileEjercicio11();
    }
    
    public static void whileEjercicio1(){
        Scanner teclado = new Scanner(System.in);
        
        int contador = 0;
        int limite = 10;
        
        while(contador < limite){
            System.out.println("numero = "+contador);
            contador++;
        }
    }
    
    public static void whileEjercicio2(){
        Scanner teclado = new Scanner(System.in);
        
        int c = 0;
        int n;
        
        System.out.println("ingrese el número limite");
        n = teclado.nextInt();
        
        while(c < n){
            System.out.println("numero = "+c);
            c++;
        }
        
    }
    
    public static void whileEjercicio3(){
        Scanner teclado = new Scanner(System.in);
        int numeroEstudiantes, hombres, mujeres, alumno;
        String opcion;
        double porcentajeHombres, porcentajeMujeres,totalAlumnos;
        
        alumno = 1;
        mujeres = 0;
        hombres = 0;
        
        System.out.println("ingrese la cantidad de alumnos:");
        numeroEstudiantes = teclado.nextInt();
        
        while(alumno <= numeroEstudiantes){
            System.out.print("digite 'hombre' o 'mujer' según sea el caso: ");
            opcion = teclado.next();
            System.out.println();
            
            if(opcion.equals("mujer")){
                mujeres++;
            }
            else if(opcion.equals("hombre")){
                hombres++;
            }
            else{
                System.out.println("alumno no identificado, vuelva a intentarlo");
                alumno--;
            }
            
            alumno++;
        }
        totalAlumnos = hombres + mujeres;
        porcentajeHombres = (hombres / totalAlumnos) * 100;
        porcentajeMujeres = (mujeres / totalAlumnos) * 100;
        System.out.println("el total de hombres y mujeres es "+totalAlumnos);
        System.out.println("el porcentaje de mujeres es " + porcentajeMujeres+ " %");
        System.out.println("el porcentaje de hombres es " + porcentajeHombres + " %");
        System.out.println("hay "+hombres+" hombres y "+mujeres+" mujeres");
        
        
        
    }
    
    public static void whileEjercicio4(){
        Scanner teclado = new Scanner(System.in);
        int rojos, verdes, rosados, amarillos, azules,totalAutos,auto, digito;
        
        rojos = 0;
        verdes = 0;
        rosados = 0;
        amarillos = 0;
        azules = 0;
        auto = 1;
        
        System.out.print("ingrese la cantidad de autos: ");
        totalAutos = teclado.nextInt();
        
        while(auto <= totalAutos){
            System.out.print("ingrese el último dígito de la placa del auto: ");
            digito = teclado.nextInt();
            System.out.println();
            
            if(digito ==1 || digito ==2){
                amarillos++;
            }
            else if(digito == 3 || digito == 4){
                rosados++;
            }
            else if(digito == 5 || digito == 6){
                rojos++;
            }
            else if(digito == 7 || digito == 8){
                verdes++;
            }
            else if(digito == 9 || digito == 0){
                azules++;
            }
            else{
                System.out.println("digito incorrecto, vuelva  a intentarlo");
                auto--;
            }
            
            auto++;
            
        }
        System.out.println();
        System.out.println("ingresaron "+amarillos+" autos amarillos");
        System.out.println("ingresaron "+rosados+" autos rosados");
        System.out.println("ingresaron "+rojos+" autos rojos");
        System.out.println("ingresaron "+verdes+" autos verdes");
        System.out.println("ingresaron "+azules+" autos azules");
        
    }
    
    public static void whileEjercicio5(){
        Scanner teclado = new Scanner(System.in);
        
        int numeroAlumnos, cantidadNotas, alumno,notaActual;
        double promedioAlumno, nota, sumatoriaNotas, promedioGeneral, sumatoriaGeneral;
        
        
        alumno = 1;
        promedioAlumno = 0;
        sumatoriaNotas = 0;
        notaActual = 1;
        sumatoriaGeneral = 0;
        
        System.out.print("ingrese la cantidad de alumnos:");
        numeroAlumnos = teclado.nextInt();
        
        System.out.println("cuantas notas se realizaron para cada alumno?");
        cantidadNotas = teclado.nextInt();
        
        while(alumno <= numeroAlumnos){
            System.out.println("Alumno numero "+alumno+":");
            
            promedioAlumno = sumatoriaNotas / cantidadNotas;
            sumatoriaGeneral += promedioAlumno;
            
            
            while(notaActual <= cantidadNotas){
                System.out.print("ingrese la nota "+notaActual+":");
                nota = teclado.nextDouble();
                sumatoriaNotas += nota;
                notaActual++;
            }
            promedioAlumno += sumatoriaNotas / cantidadNotas;
            sumatoriaNotas = 0;
            sumatoriaGeneral += promedioAlumno;
            notaActual = 1;
            alumno++;
            
            System.out.println();
              
        }
        
        promedioGeneral = sumatoriaGeneral / numeroAlumnos;
        System.out.println("el promedio general de los estudiantes es "+promedioGeneral);
    }
    
    public static void whileEjercicio6(){
        Scanner teclado = new Scanner(System.in);
        double capital;
        int mes;
        
        mes = 1;
        
        System.out.print("ingrese su capital inicial:");
        capital = teclado.nextDouble();
        
        while(mes <= 12){
            capital *= 1.02;
            mes++;
        }
        
        System.out.println("su capital final al cabo de un año será "+capital);
    }
    
    public static void whileEjercicio7(){
        
        Scanner teclado = new Scanner(System.in);
        int cantidadAlumnos, alumno, edad, sexo, cantidadMujeres, cantidadHombres;
        double sumatoriaEdadHombres, sumatoriaEdadMujeres, promedioHombres, promedioMujeres;
        double promedioGeneral;
        
        alumno = 1;
        sumatoriaEdadMujeres = 0;
        sumatoriaEdadHombres = 0;
        cantidadMujeres = 0;
        cantidadHombres = 0;
        promedioHombres = 0;
        promedioMujeres = 0;
        
        System.out.print("ingrese la cantidad de alumnos:");
        cantidadAlumnos = teclado.nextInt();
        
        while(alumno <= cantidadAlumnos){
            System.out.println("Alumno "+alumno+":");
            System.out.print("ingrese su edad:");
            edad = teclado.nextInt();
            
            System.out.println("ingrese '1' para mujer y '2' para hombre:");
            sexo = teclado.nextInt();
            System.out.println();
            
            if(sexo == 1){
                cantidadMujeres++;
               sumatoriaEdadMujeres += edad;
               
            }
            else{
                cantidadHombres++;
                sumatoriaEdadHombres += edad;
            }
            
            alumno++;
        }
        
        promedioMujeres = sumatoriaEdadMujeres / cantidadMujeres;
        promedioHombres = sumatoriaEdadHombres / cantidadHombres;
        promedioGeneral = (promedioMujeres + promedioHombres) / 2;
        
        System.out.println("hay "+cantidadMujeres+" mujeres, el promedio de edad es "+promedioMujeres);
        System.out.println("hay "+cantidadHombres+" hombres, el promedio de edad es "+promedioHombres);
        System.out.println("en total hay "+cantidadAlumnos+" alumnos y el promedio de edad es "+promedioGeneral);
    }
    
    public static void whileEjercicio8(){
        Scanner teclado = new Scanner(System.in);
    
        double numeroMenor, numeroIngresado;
        int cantidadNumeros, numeroActual;
        
        numeroActual = 1;
        numeroMenor = 0;
        
        System.out.print("ingrese la cantidad de numeros a evaluar:");
        cantidadNumeros = teclado.nextInt();
        
        while(numeroActual <= cantidadNumeros){
            System.out.print("ingrese el numero "+numeroActual+": ");
            numeroIngresado = teclado.nextDouble();
            
            if(numeroActual == 1){
                numeroMenor = numeroIngresado;
            }
            
            if(numeroMenor > numeroIngresado){
                numeroMenor = numeroIngresado;
            }
            
            numeroActual++;
        }
        
        System.out.println("el número menor es "+numeroMenor);
    }
    
    public static void whileEjercicio9(){
        Scanner teclado = new Scanner(System.in);
    
        double numeroMayor, numeroIngresado;
        int cantidadNumeros, numeroActual;
        
        numeroActual = 1;
        numeroMayor = 0;
        
        System.out.print("ingrese la cantidad de numeros a evaluar:");
        cantidadNumeros = teclado.nextInt();
        
        while(numeroActual <= cantidadNumeros){
            System.out.print("ingrese el numero "+numeroActual+": ");
            numeroIngresado = teclado.nextDouble();
            
            if(numeroActual == 1){
                numeroMayor = numeroIngresado;
            }
            
            if(numeroMayor < numeroIngresado){
                numeroMayor = numeroIngresado;
            }
            
            numeroActual++;
        }
        System.out.println("el número mayor es "+numeroMayor);
    }
    
    public static void whileEjercicio10(){
        Scanner teclado = new Scanner(System.in);
        
        double valorTotalCliente,valorCompra, valorVendidoDia;
        int numeroCompras, compra,opcion;
        boolean bandera;
        
        bandera = true;
        valorTotalCliente = 0;
        valorVendidoDia = 0;
        compra = 1;
        
        while(bandera){
            System.out.print("ingrese la cantidad de compras del usuario: ");
            numeroCompras = teclado.nextInt();
            
            while(compra <= numeroCompras){
                System.out.print("ingrese el valor de la compra " + compra + ": ");
                valorCompra = teclado.nextDouble();
                
                valorTotalCliente += valorCompra;
                compra++;
            }
            System.out.println();
            System.out.println("el total a pagar del cliente es " + valorTotalCliente);
            System.out.println();
            System.out.println();
            
            valorVendidoDia += valorTotalCliente;
            valorTotalCliente = 0;
            compra = 1;
            
            System.out.println("ingrese '1' para registrar venta ó '2' para finalizar dia:");
            opcion = teclado.nextInt();
            System.out.println();
            
            if(opcion == 2){
                bandera = false;
            }     
        }
        
        System.out.println("dia finalizado, el vendedor obtuvo " + valorVendidoDia + " en ventas");
    }
    
    public static void whileEjercicio11(){
        Scanner teclado = new Scanner(System.in);
        int cantidadMiembros, miembro, intentoPeso;
        double peso, promedioPeso, sumatoriaPeso, pesoUltimaVez, diferenciaPeso;
        
        cantidadMiembros = 5;
        miembro = 1;
        intentoPeso = 1;
        promedioPeso = 0;
        sumatoriaPeso = 0;
        pesoUltimaVez = 0;
        
        while(miembro <= cantidadMiembros){
            System.out.println("Miembro "+miembro+":");
            
            System.out.print("ingrese el peso de la ultima vez que se pesó:");
            pesoUltimaVez = teclado.nextDouble();
            
            while(intentoPeso <= 10){
                System.out.print("Intento de peso "+intentoPeso+": ");
                peso = teclado.nextDouble();
                
                sumatoriaPeso += peso;
                intentoPeso++;
            }
            intentoPeso = 1;
            promedioPeso = sumatoriaPeso / 10;
            diferenciaPeso = promedioPeso - pesoUltimaVez;
            sumatoriaPeso = 0;
            System.out.println("su promedio de peso fue "+promedioPeso);
            
            if(diferenciaPeso > 0){
                System.out.println("ha subido de peso");
                System.out.println("fueron "+diferenciaPeso+" kilos");
            }
            else{
                System.out.println("ha bajado de peso");
                System.out.println("fueron "+diferenciaPeso+" kilos");
            }
            
            System.out.println();    
            miembro++;
        }
    }
    
}
