

//Subproceso de prueba. Muestra un texto por pantalla.
SubProceso escribirMensaje(numAdivinar)
	
	Escribir "****** FELICIDADES HAS ACERTADO ******";
	Escribir 'EL NÚMERO SECRETO ES ',numAdivinar
	
Fin SubProceso

//Subproceso que pide un número y hasta que el usuario no escribe 
//un valor entre 1 y 100,  vuelve a pedir el valor.
SubProceso num = leerNumero()
	Definir num como entero;
		Repetir
			Escribir "DEBE SER UN NUMERO ENTRE 0 Y 100.";
			Leer num;
		Hasta Que (num > 0) Y (num <= 100);
FinSubProceso


Algoritmo adivinaNumeroV2subproc
	
	// Definir variables
	Definir num Como Entero
	Definir numAdivinar Como Entero
	Definir numIntentos Como Entero
	
	num = 0;
	numAdivinar <- azar(100)+1
	numIntentos <- 10
	
	Escribir numAdivinar
	
	// Leer datos.
	
	Escribir 'Introduce un número(',numIntentos,' intentos): '
	num = leerNumero();
	
	Mientras ((num<>numAdivinar) Y (numIntentos>1)) Hacer
		
		Si numAdivinar>num Entonces
			Escribir 'Bajo. El número al azar es mayor que el introducido.'
			Escribir 'Vuelve a intentarlo (Quedan ',numIntentos,')'
			
		SiNo
			Escribir 'Alto. El número al azar es menor que el introducido.'
			
		FinSi
		
		numIntentos <- numIntentos-1
		
		Escribir 'Te quedan ',numIntentos,' intentos'
		num = leerNumero();
		
	FinMientras
	
	
	Si (numAdivinar=num) Entonces
		escribirMensaje(numAdivinar);
		
	SiNo
		Escribir 'UY, ALGO SALIÓ MAL.'
		
	FinSi
	
FinAlgoritmo
