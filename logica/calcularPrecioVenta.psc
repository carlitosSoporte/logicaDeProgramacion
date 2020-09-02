//El dueño de una tienda compra un articulo a un precio determinado. Obtener el precio
//en que lo debe vender para obtener una ganancia del 30%.

Proceso calcularPrecioVenta
	
	definir precioArticulo Como Real;
	
	Escribir "ingrese el valor del articulo: ";
	leer precioArticulo;
	
	precioArticulo = precioArticulo * 1.3;
	
	Imprimir "debe vender el articulo en ",precioArticulo;
	
FinProceso

