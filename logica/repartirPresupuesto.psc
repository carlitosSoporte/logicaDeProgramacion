//En un hospital existen tres �reas: Ginecolog�a, Pediatr�a, Traumatologia. El presupuesto
//anual del hospital se reparte conforme a la sig. tabla:
//	�rea Porcentaje del presupuesto
	//Ginecolog�a 40%
	//Traumatologia 30%
	//Pediatr�a 30%
	
	//Obtener la cantidad de dinero que recibir� cada �rea, para cualquier monto presupuestal.

Proceso repartirPresupuesto
	
	definir presupuesto, ginecologia, traumatologia, pediatria Como Real;
	
	Escribir "ingrese el presupuesto asignado: ";
	leer presupuesto;
	
	ginecologia = presupuesto * 0.4;
	traumatologia = presupuesto * 0.3;
	pediatria = presupuesto * 0.3;
	
	imprimir "ginecologia recibir� ",ginecologia;
	imprimir "traumatologia recibir� ",traumatologia;
	imprimir "pediatria recibir� ",pediatria;
	
	
FinProceso
