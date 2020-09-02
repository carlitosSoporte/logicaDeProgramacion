//Dada un cantidad en pesos, obtener la equivalencia en dólares, asumiendo que la unidad
//cambiaría es un dato desconocido.

Proceso convertirDolar
	
	definir cantidadPesos, precioDolar, conversion Como Real;
	
	Escribir "ingrese la cantidad en pesos a convertir: ";
	leer cantidadPesos;
	
	Escribir "ingrese la tasa de cambio: ";
	leer precioDolar;
	
	
	conversion=  cantidadPesos / precioDolar;
	
	Imprimir "su equivalencia en dolares es ",conversion;
	
	
FinProceso
