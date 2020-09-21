
package arraysejercicios;

import javax.swing.JOptionPane;

public class ArraysEJERCICIOS {

    public static void main(String[] args) {
        ejercicioArreglos7();
    }
    
    
    static void ejercicioArreglos1(){
        int dimension;
        
        dimension = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de elementos:"));
        char [] letras = new char[dimension];
        
        for(int i=0; i<letras.length;i++){
            letras[i]= JOptionPane.showInputDialog("ingrese la letra "+(i+1)+":").charAt(0);
        }
        
        for(char letra:letras){
            System.out.print(letra);
        }
        System.out.println();   
    }
    
    static void ejercicioArreglos2(){
        
        String [] nombres = {"carlos","ana","jesus","ramon","pepe","simón"};
        for(String nombre:nombres){
            System.out.println(nombre);
        }
    }
    
    static void ejercicioArreglos3(){
        int dimension;

        dimension = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números:"));
        double [] numeros = new double[dimension];
        
        for(int i=0;i<numeros.length;i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero "+(i+1)+":"));
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
        int [] numeros = new int[10];
        
        System.out.println("LOS NUMEROS GENERADOS SON:");
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*5+1);
            System.out.print(numeros[i]+"   ");
        }
        
        System.out.println("\n\nIMPRESION EN ORDEN CONTRARIO");
        for(int i=numeros.length-1;i>=0;i--){
            System.out.print(numeros[i]+"   ");
        }
        System.out.println();
    }
    
    static void ejercicioArreglos6(){
        
        double [] numeros = new double[8];
        
        //pos 0=positivos, pos 1= negativos
        double [] sumatorias = new double[2];
        
        //pos 0=positivos, pos 1= negativos
        double [] medias = new double[2];
        
        //pos 0=numero de positivos , pos 1= numero negativos, pos 3= numero de ceros
        int [] cantidadNumeros = new int[3];

        for(int i=0; i<numeros.length;i++){
            numeros[i]= Double.parseDouble(JOptionPane.showInputDialog("ingrese el número "+(i+1)+":"));
            
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
        int [] B = new int[5];
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
        }
        System.out.println();  
    }
}
