//Tres personas deciden invertir su dinero para fundar una empresa. Cada una de ellas
//	invierte una cantidad distinta. Obtener el porcentaje que cada quien invierte con
//	respecto a la cantidad total invertida.


Proceso calcularInversion
	
	definir inversionTotal, inversion1, inversion2, inversion3 Como Real;
	definir porcentajeInversion1, porcentajeInversion2, porcentajeInversion3 Como Real;
	
	Escribir "ingrese el valor invertido de la persona 1:";
	leer inversion1;
	
	Escribir "ingrese el valor invertido de la persona 2:";
	leer inversion2;
	
	Escribir "ingrese el valor invertido de la persona 3:";
	leer inversion3;
	
	inversionTotal = inversion1 + inversion2 + inversion3;
	porcentajeInversion1 = ( inversion1 / inversionTotal ) *100;
	porcentajeInversion2 = ( inversion2 / inversionTotal ) *100;
	porcentajeInversion3 = ( inversion3 / inversionTotal ) *100;
	
	Imprimir "la inversion total fue ",inversionTotal;
	Imprimir "el procentaje del primer inversionista fue ",porcentajeInversion1," %";
	Imprimir "el procentaje del segundo inversionista fue ",porcentajeInversion2," %";
	Imprimir "el procentaje del tercer inversionista fue ",porcentajeInversion3, " %";
	
FinProceso
