//Leer un numero y escribir el valor absoluto del mismo.

Proceso calcularAbsoluto
	
	definir absoluto Como Real;
	
	Escribir "ingrese el número: ";
	leer absoluto;
	
	
	Si absoluto < 0 Entonces
		absoluto =  absoluto * (-1);
	Sino
		
	Fin Si
	
	Escribir "el valor absoluto es: ",absoluto;
	
FinProceso
