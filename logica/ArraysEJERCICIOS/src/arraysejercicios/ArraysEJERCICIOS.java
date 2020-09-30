
package arraysejercicios;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArraysEJERCICIOS {

    public static void main(String[] args) {
        ejercicioPropuesto11();
    }
    
    
    static void ejercicioArreglos1(){
        int dimension;
        Scanner teclado = new Scanner(System.in);
        
        dimension = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de elementos:"));
        char [] letras = new char[dimension];
        
        for(int i=0; i<letras.length;i++){
            /*System.out.print("ingrese la letra "+(i+1)+":");
            letras[i]= teclado.next().charAt(0);*/
            letras[i]= JOptionPane.showInputDialog("ingrese la letra "+(i+1)+":").charAt(0);
        }
        
        for(char letra:letras){
            System.out.print(letra);
        }
        System.out.println();   
    }
    
    static void ejercicioArreglos2(){
        
        String [] nombres = {"carlos","ana","jesus","ramon","pepe","simón"};
        
        System.out.print("Nombres[]{  ");
        for(String nombre:nombres){
            System.out.print(nombre+"  ");
        }
        System.out.print("}\n");
    }
    
    static void ejercicioArreglos3(){
        int dimension;

        dimension = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números:"));
        double [] numeros = new double[dimension];
        
        for(int i=0;i<numeros.length;i++){
            numeros[i]=Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero de la posición "+i+":"));
        }
        
        for(int i=0;i<numeros.length;i++){
            System.out.println("el número en la posición "+i+" es: "+numeros[i]);
        }       
    }
    
    static void ejercicioArreglos4(){
        double sumatoriaPromedio, promedio;
        int mayoresPromedio;
        
        mayoresPromedio = 0;
        sumatoriaPromedio = 0;
        promedio = 0;
        int [] numeros = new int[10];
        System.out.println("LOS NUMEROS GENERADOS SON:");
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*5+1);
            System.out.print(numeros[i]+"   ");
            sumatoriaPromedio += numeros[i];
        }
        
        promedio = sumatoriaPromedio / numeros.length;
        System.out.println("\n\nEl promedio fue "+promedio);
        System.out.println("\nLos valores mayores a el promedio son:");

        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>promedio){
                System.out.print(numeros[i]+"  ");
                mayoresPromedio++;
            }
        }       
        System.out.println("\n\nLa cantidad de numeros mayores a el promedio fue "+mayoresPromedio);
    }
    
    static void ejercicioArreglos5(){
        
        int numeroElementos = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de números a generar:"));
        int [] numeros = new int[10];
        
        System.out.println("LOS NUMEROS GENERADOS SON:");
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*50+1);
            System.out.print(numeros[i]+"   ");
        }
        
        System.out.println("\n\nIMPRESION EN ORDEN CONTRARIO");
        for(int i=numeros.length-1;i>=0;i--){
            System.out.print(numeros[i]+"   ");
        }
        System.out.println();
    }
    
    static void ejercicioArreglos6(){
        Random aleatorio = new Random();
        int [] numeros = new int[25];
        
        //pos 0=positivos, pos 1= negativos
        double [] sumatorias = new double[2];
        
        //pos 0=positivos, pos 1= negativos
        double [] medias = new double[2];
        
        //pos 0=numero de positivos , pos 1= numero negativos, pos 3= numero de ceros
        int [] cantidadNumeros = new int[3];

        System.out.print("Numeros generados[] {  ");
        for(int i=0; i<numeros.length;i++){
            numeros[i]= aleatorio.nextInt(5-(-5)+1)+(-5);
            System.out.print(numeros[i]+"  ");
            
            if(numeros[i]>0){
                sumatorias[0]+=numeros[i];
                cantidadNumeros[0]++;
            }
            else if(numeros[i] < 0){
                sumatorias[1] +=numeros[i];
                cantidadNumeros[1]++;
            }
            else{
                cantidadNumeros[2]++;
            }
        }
        System.out.print("}\n");
        //promedio positivos
        medias[0] = sumatorias[0] / cantidadNumeros[0];
        
        //promedio negativos
        medias[1] = sumatorias[1] / cantidadNumeros[1];
        
        System.out.println("\nLa media de los números positivos es "+medias[0]);
        System.out.println("\nLa media de los números negativos es "+medias[1]);
        System.out.println("\nEl número de ceros es "+cantidadNumeros[2]);
    }
    
    static void ejercicioArreglos7(){
        int [] A = new int[5];
        int [] B = new int[A.length];
        int [] C = new int[A.length+B.length];
        
        System.out.print("A[]= ");
        for(int i=0;i < A.length;i++){
            A[i] = (int)(Math.random()*100+1);
            System.out.print(A[i]+"  ");
        }       
        System.out.print("\n\nB[]= ");
        for(int i=0;i < B.length;i++){
            
            B[i] = (int)(Math.random()*100+1);
            System.out.print(B[i]+"  ");
            
        }      
        System.out.print("\n\nC[]= ");
        int ayuda=0;
        for(int i=0;i < A.length;i++){
            C[ayuda]=A[i];
            C[ayuda+1]=B[i];
            System.out.print(C[ayuda]+"  "+C[ayuda+1]+"  ");
            ayuda+=2;
        }
        System.out.println();  
    }
    
    static void ejercicioArreglos8(){
         
        double sumaTotal;
        int cantidadNumeros;
        
        sumaTotal=0;
        cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de números"));
        double []numeros = new double[cantidadNumeros];
        
        for(int i=0; i<numeros.length;i++){
            numeros[i]=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de la posición "+i+":"));
            sumaTotal+=numeros[i];
        }
        
        for(int i=0; i<numeros.length;i++){
            if(i< numeros.length-1){
                System.out.print(numeros[i]+" + ");
            }
            else{
                System.out.print(numeros[i]+" = ");
            }           
        } 
        
        System.out.println(sumaTotal);   
    }
    
    static void ejercicioArreglos9(){
        int cantidadPalabras;
        cantidadPalabras = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de palabras:"));
        String [] palabras = new String[cantidadPalabras];
        
        for(int i=0;i<palabras.length;i++){
            palabras[i]=JOptionPane.showInputDialog("ingrese la palabra "+(i+1)+":");
        }
        
        System.out.print("palabras[]{ ");
        for(int i=0;i<palabras.length;i++){
            System.out.print(palabras[i]+" ");
        }
        System.out.println(" }");
    }
    
    static void ejercicioArreglos10(){
        String[] palabra = {"jefe","rendon"};
        
        for (int i = 0; i < palabra.length; i++) {
            for (int j = 0; j < palabra[i].length(); j++) {
                System.out.print(palabra[i].charAt(j)+" ");
            }
            System.out.println("\n");
            
        }
    }
    
    
    //ejercicios con nota
    static void ejercicioPropuesto1(){
        DecimalFormat formato = new DecimalFormat("#.#");
        Random aleatorio = new Random();
        double [] numeros= new double[5];
        double sumatoriaNumeros, promedio;
        
        int cantidadMayoresPromedio = 0;
        sumatoriaNumeros = 0;
        promedio = 0;
        
        System.out.println("NUMEROS GENERADOS ALEATORIAMENTE:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= 0+(5-0)*aleatorio.nextDouble();
            System.out.print(formato.format(numeros[i])+"  ");
            sumatoriaNumeros += numeros[i];
        }
        
        promedio = sumatoriaNumeros / numeros.length;
        
        System.out.println("\n\nEl promedio de los números fue "+formato.format(promedio));
        
        System.out.println("\nLos números mayores que el promedio son:");
        for (int i = 0; i < numeros.length; i++) {  
            if (numeros[i] > promedio) {
                System.out.print(formato.format(numeros[i])+"  ");
                cantidadMayoresPromedio++;
            }      
        }
        System.out.println("\n\nLa cantidad de números mayores que el promedio fue "+cantidadMayoresPromedio);
    }
    
    static void ejercicioPropuesto2(){
        Random aleatorio = new Random();
        DecimalFormat formato = new DecimalFormat("#.###");
        double [] A = new double[5];
        double [] B = new double[A.length];
        double [] C = new double[A.length];
        
        System.out.print("Sumando 1[] {  ");
        for (int i = 0; i < A.length; i++) {
            A[i]=4+(5-4)*aleatorio.nextDouble();
            System.out.print(formato.format(A[i])+"  ");
        }
        System.out.print("}");
        
        System.out.print("\nSumando 2[] {  ");
        for (int i = 0; i < A.length; i++) {
            B[i]=0+(5-0)*aleatorio.nextDouble();
            System.out.print(formato.format(B[i])+"  ");
            C[i]=A[i]+B[i];
        }
        System.out.print("}");
        
        System.out.print("\nResultado Final[] {  ");
        for (int i = 0; i < A.length; i++) {
            C[i]=A[i]+B[i];
            System.out.print(formato.format(C[i])+"  ");
            C[i]=A[i]+B[i];
        }
        System.out.print("}");
    }
    
    static void ejercicioPropuesto3(){
        int [] numeros = new int[5];
        int posicion, numeroMayor;
        
        posicion = 0;
        numeroMayor = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*50+1);
            System.out.println(+numeros[i]+" está en la posición "+i);
            if(numeros[i] > numeroMayor){
                numeroMayor = numeros[i];
                posicion=i;
            }
        }
        
        System.out.println("\nEl número mayor es "+numeroMayor+" y su posición es "+posicion);
    }
    
    static void ejercicioPropuesto4(){
        int [] numeros = new int[5];
        int [] cuadrados = new int[numeros.length];
        
        System.out.print("NUMEROS[] {  ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*50+1);
            System.out.print(numeros[i]+"  ");
        }
        System.out.print("}");
        
        System.out.print("\nCUADRADOS[] {  ");
        for (int i = 0; i < numeros.length; i++) {
            cuadrados[i]= (int) Math.pow(numeros[i], 2);
            System.out.print(cuadrados[i]+"  ");
        }
        System.out.print("}");
    }
    
    static void ejercicioPropuesto5(){
        Random aleatorio = new Random();
        int [] numeros= new int[5];
        int positivos,negativos, ceros, sumatoriaPositivos,sumatoriaNegativos;
        
        positivos = 0;
        negativos = 0;
        ceros = 0;
        sumatoriaPositivos = 0;
        sumatoriaNegativos = 0;
        
        System.out.println("NUMEROS GENERADOS:");
        for (int i = 0; i < numeros.length; i++) {
            
            //genera números enteros aleatorios entre -5 y 5
            numeros[i]= aleatorio.nextInt(5-(-5)+1)+(-5);
            System.out.print(numeros[i]+"  ");
            
            if (numeros[i] > 0) {
                positivos++;
                sumatoriaPositivos+=numeros[i];
            }
            if (numeros[i] < 0) {
                negativos++;
                sumatoriaNegativos += numeros[i];
            }
            if (numeros[i]==0) {
                ceros++;
            }
        }
        
        System.out.println("\n\nLa cantidad de ceros es "+ceros);
        System.out.println("La cantidad de números negativos es "+negativos);
        System.out.println("La cantidad de números positivos es "+positivos);
        System.out.println("\nLa sumatoria de números positivos es "+sumatoriaPositivos);
        System.out.println("La sumatoria de números negativos es "+sumatoriaNegativos);
    }
    
    
    //ejercicios para exponer
    static void ejercicioPropuesto9(){
        Scanner sc = new Scanner(System.in);
        boolean numeroEncontrado=false;
        int n, num;
        System.out.print("Cuántos números va a ingresar?: ");
        n=sc.nextInt();
        int vector[]=new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número para la posición "+i+": ");
            vector[i]=sc.nextInt();
        }
        
        System.out.print("\nIngrese número a buscar: ");
        num=sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (vector[i]==num) {
                System.out.println("\nEl número se encuentra en la posición: "+i);
                numeroEncontrado=true;
                break;
            }
        }
        if (!numeroEncontrado) {
            System.out.println("No,   número no encontrado.");
        }
    }
    
    static void ejercicioPropuesto10(){
       Random aleatorio = new Random();
       int[] A = new int[20];
       int[] B = new int[A.length];
       int[] C = new int[A.length];
       
        System.out.print("A[]{ ");
        for (int i = 0; i < A.length; i++) {
            //genera números aleatorios entre 0 y 50.
            A[i]=aleatorio.nextInt(50-0+1)+0;
            System.out.print(A[i]+" ");
        }
        System.out.print("}\n\n");
        
        System.out.print("B[]{ ");
        for (int i = 0; i < B.length; i++) {
            //genera números aleatorios entre 0 y 50.
            B[i]=aleatorio.nextInt(50-0+1)+0;
            System.out.print(B[i]+" ");
        }
        System.out.print("}\n\n");
        
        System.out.print("C[]{ ");
        for (int i = 0; i < C.length; i++) {
            //genera números aleatorios entre 0 y 50.
            C[i] = A[i] * B[B.length-i-1];
            System.out.print(C[i]+" ");
        }
        System.out.print("}\n");
    }
    
    static void ejercicioPropuesto11(){
        double []fibonacci = new double [100];
        
        fibonacci[0]=0;
        fibonacci[1]=1;
        for (int i = 2; i < fibonacci.length; i++) {
            if(i==0){
                fibonacci[i]=0;
                fibonacci[i+1]=1;
                
            }else{
                fibonacci[i]= fibonacci[i-2]+fibonacci[i-1];
            }  
        }
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println("posición "+i+": "+fibonacci[i]);
        }
    }
    
}
