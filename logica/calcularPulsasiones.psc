//Calcular el numero de pulsaciones que una persona debe tener por cada 10 segundos de
//ejercicio, si la formula es:
		
//		num. pulsaciones = (220 - edad)/10

Proceso calcularPulsasiones
	
	definir edad Como Entero;
	definir numeroPulsasiones Como Real;
	
	
	Escribir "ingrese su edad: ";
	leer edad;
	
	
	numeroPulsasiones = (220 - edad)/10;
	
	Imprimir "su número de pulsasiones es: ",numeroPulsasiones;
	
	
FinProceso
