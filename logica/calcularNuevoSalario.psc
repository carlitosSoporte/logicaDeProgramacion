//Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre su salario
//	anterior.

Proceso calcularSalario
	
	definir salario Como Real;
	
	
	Escribir "ingrese su salario sin incremento:";
	leer salario;
	
	salario = salario * 1.25;
	
	Imprimir " su nuevo salario es: ",salario;
FinProceso
