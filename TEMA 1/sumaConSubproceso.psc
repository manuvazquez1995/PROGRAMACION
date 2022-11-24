// Crear un subproceso que devuelva la suma de dos números pasados por parámetro

SubProceso resultado = sumaNumeros(n1,n2)
	Definir resultado como Entero;
	resultado = n1 + n2;
	
FinSubProceso


Algoritmo sumaConSubproceso
	
	Definir n1 como Entero;
	Definir n2 como Entero;
	Definir resultado como Entero;
	
	n1 = 0;
	n2 = 0;
	resultado = 0;
	
	Escribir "Introduzca un número: ";
	Leer n1;
	Escribir "Introduzca otro número";
	Leer n2;
	
	resultado =  sumaNumeros(n1,n2);
	Escribir "RESULTADO: ", resultado;
	
	
FinAlgoritmo
