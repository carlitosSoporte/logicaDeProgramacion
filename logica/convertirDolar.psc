//Dada un cantidad en pesos, obtener la equivalencia en d�lares, asumiendo que la unidad
//cambiar�a es un dato desconocido.

Proceso convertirDolar
	
	definir cantidadPesos, precioDolar, conversion Como Real;
	
	Escribir "ingrese la cantidad en pesos a convertir: ";
	leer cantidadPesos;
	
	Escribir "ingrese la tasa de cambio: ";
	leer precioDolar;
	
	
	conversion=  cantidadPesos / precioDolar;
	
	Imprimir "su equivalencia en dolares es ",conversion;
	
	
FinProceso
