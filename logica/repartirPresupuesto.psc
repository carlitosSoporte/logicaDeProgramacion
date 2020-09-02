//En un hospital existen tres áreas: Ginecología, Pediatría, Traumatologia. El presupuesto
//anual del hospital se reparte conforme a la sig. tabla:
//	Área Porcentaje del presupuesto
	//Ginecología 40%
	//Traumatologia 30%
	//Pediatría 30%
	
	//Obtener la cantidad de dinero que recibirá cada área, para cualquier monto presupuestal.

Proceso repartirPresupuesto
	
	definir presupuesto, ginecologia, traumatologia, pediatria Como Real;
	
	Escribir "ingrese el presupuesto asignado: ";
	leer presupuesto;
	
	ginecologia = presupuesto * 0.4;
	traumatologia = presupuesto * 0.3;
	pediatria = presupuesto * 0.3;
	
	imprimir "ginecologia recibirá ",ginecologia;
	imprimir "traumatologia recibirá ",traumatologia;
	imprimir "pediatria recibirá ",pediatria;
	
	
FinProceso
