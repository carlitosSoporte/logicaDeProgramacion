
package ciclosfor;

import java.util.Scanner;

public class CiclosFor {

    public static void main(String[] args) {
        ejercicioFor8();
    }
    
    
    public static void ejercicio1For(){
        Scanner teclado = new Scanner(System.in);
        
        int contador,limite;
        
        System.out.print("ingrese el limite: ");
        limite = teclado.nextInt();
        
        for(contador = 1;contador <= limite; contador++){
            System.out.println("el valor es " + contador);
        }
        
    }
    
    public static void ejercicio2For(){
        Scanner teclado = new Scanner(System.in);
        
        int contador,limite;
        
        System.out.print("ingrese el limite: ");
        limite = teclado.nextInt();
        
        for(contador = 10;contador >= limite; contador--){
            System.out.println("el valor es " + contador);
        }
    }
    
    public static void ejercicio3For(){
        
        Scanner teclado = new Scanner(System.in);
        double promedio, sumatoriaNotas, nota;
        
        promedio = 0;
        sumatoriaNotas = 0;
        nota = 0;
        
        for(int i=1;i <= 7; i++){
            System.out.print("ingrese la nota " + i + ": ");
            nota = teclado.nextDouble();
            sumatoriaNotas += nota;
        }
        
        promedio = sumatoriaNotas / 7;
        System.out.println("su promedio de la asignatura es " + promedio);
    }
    
    
    //hechos en clase
    public static void ejercicioFor2(){
        Scanner teclado = new Scanner(System.in);
        double numero, cubo, cuarta;
        
        
        numero = 0;
        cubo = 0;
        cuarta = 0;
        
        for(int i= 1; i <= 10; i++){
            System.out.println("ingrese el numero "+i+" a evluar:");
            numero = teclado.nextDouble();
            cubo = numero * numero * numero;
            cuarta = cubo * numero;
            System.out.println("el cubo de "+numero+" es "+cubo);
            System.out.println("la cuarta de "+numero+" es "+cuarta);
            System.out.println();
        }
     
    }
    
    public static void ejercicioFor3(){
        Scanner teclado = new Scanner(System.in);
        double numero;
        
        for(int i= 1; i<= 10; i++){
            
            System.out.println("ingrese el numero "+i+" a evluar:");
            numero = teclado.nextDouble();
            
            if(numero>0){
                System.out.println(numero+" es positivo");
            }
            
        }
    }
    
    public static void ejercicioFor4(){
        Scanner teclado = new Scanner(System.in);
        int positivos, negativos, neutros;
        double numero;
        
        positivos = 0;
        neutros = 0;
        negativos = 0;
        
        for(int i = 1; i <= 20; i++){
            System.out.print("ingrese el numero "+i+" a evaluar:");
            numero = teclado.nextDouble();
            if(numero > 0){
                positivos++;
            }
            else if(numero < 0){
                negativos++;
            }
            else{
                neutros++;
            }
        }
        
        System.out.println();
        System.out.println("Se ingresaron:");
        System.out.println(positivos+" números positivos");
        System.out.println(negativos+" números negativos");
        System.out.println(neutros+ " números neutros");
    }
    
    public static void ejercicioFor5(){
        Scanner teclado = new Scanner(System.in);
        double numero;
        
        for(int i=1; i <= 15; i++){
            System.out.println("ingrese el número negrativo "+i+":");
            numero = teclado.nextDouble();
            
            if(numero >= 0){
                System.out.println("el número no es negativo");
                i -= 1;
            }
            else{
                numero *= -1;
                System.out.println("su número positivo es "+numero);
            }
            System.out.println();
        }
    }
    
    public static void ejercicioFor6(){
        Scanner teclado = new Scanner(System.in);
        double notaBaja, notaMedia, sumatoriaNotas, nota;
        
        notaMedia= 0;
        notaBaja = 5.1;
        sumatoriaNotas = 0;
        
        for(int i = 1; i <= 40; i++){
            System.out.println("ingrese la nota del estudiante "+i+":");
            nota = teclado.nextDouble();
            sumatoriaNotas += nota;
            if(notaBaja > nota){
                notaBaja = nota;
            }
        }
        
        notaMedia = sumatoriaNotas / 40;
        System.out.println("la nota más baja fue "+notaBaja);
        System.out.println("la nota media fue "+notaMedia);
    }
    
    public static void ejercicioFor7(){
        Scanner teclado = new Scanner(System.in);
        int numeroTabla, resultado;
        
        System.out.print("ingrese el número de la tabla a mostrar:");
        numeroTabla = teclado.nextInt();
        
        for(int i=1 ; i <= 10;i++){
            resultado = i * numeroTabla;
            System.out.println(numeroTabla+" * "+i+" = "+resultado);
        }
    }
    
    public static void ejercicioFor8(){
        
        
        for(int hora = 0;hora < 24; hora++){
       
            for(int minuto = 0; minuto < 60; minuto++){
                
                for(int segundo = 0; segundo < 60; segundo++){
                    System.out.println(hora+":"+minuto+":"+segundo);
                }
            }        
        }      
    }
}
