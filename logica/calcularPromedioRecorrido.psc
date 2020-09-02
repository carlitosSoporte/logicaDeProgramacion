//Todos los lunes, miércoles y viernes, una persona corre la misma ruta y cronometra los
//tiempos obtenidos. Determinar el tiempo promedio que la persona tarda en recorrer la
//ruta en una semana cualquiera.

Proceso calcularPromedioRecorrido
	
	definir distanciaLunes, distanciaMartes, distanciaMiercoles, promedio Como Real;
	
	
	
	Escribir "ingrese la distancia recorrida el lunes: ";
	leer distanciaLunes;
	
	Escribir "ingrese la distancia recorrida el martes: ";
	leer distanciaMartes;
	
	Escribir "ingrese la distancia recorrida el miercoles: ";
	leer distanciaMiercoles;
	
	promedio = (distanciaLunes + distanciaMartes + distanciaMiercoles)/3;
	
	Imprimir "el promedio de la distancia recorrida en la semana fue ", promedio;
FinProceso
