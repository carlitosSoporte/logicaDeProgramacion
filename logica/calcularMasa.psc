//La presión, el volumen y la temperatura de una masa de aire se relacionan por la
//formula:
	
//	masa = (presión * volumen)/(0.37 * (temperatura + 460))


Proceso calcularMasa
	definir masa, presion, volumen, temperatura Como Real;
	
	escribir "ingrese la presion:";
	leer presion;
	
	escribir "ingrese el volumen:";
	leer volumen;
	
	escribir "ingrese la temperatura:";
	leer temperatura;
	
	masa = (presion * volumen)/(0.37 * (temperatura + 460));
	
	Imprimir "la masa calculada fue: ",masa;
	
FinProceso
