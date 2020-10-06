
package sistemasar;

public class Trabajador {
    private double salarioMensualFinal;
    private double aporteMensualSAR;
    
    
    public double conocerDineroDepositadoSAR(double salarioMensual,int porcentaje){
        aporteMensualSAR = salarioMensual * (porcentaje/100);
        salarioMensualFinal = salarioMensual * (1-(porcentaje/100));
        return aporteMensualSAR;
    }
    
   
}
