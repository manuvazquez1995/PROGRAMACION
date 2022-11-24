// Juego simple que pide al usuario que adivine un n�mero en 10 intentos (usar azar(100)+1)

SubProceso escribirMensaje(numAdivinar)
	
	Escribir "****** FELICIDADES HAS ACERTADO ******";
	Escribir 'EL N�MERO SECRETO ES ',numAdivinar
	
Fin SubProceso




Algoritmo adivinaNumero
	
	// Definir variables
	Definir num Como Entero
	Definir numAdivinar Como Entero
	Definir numIntentos Como Entero
	
	num <- 0
	numAdivinar <- azar(100)+1
	numIntentos <- 10
	
	Escribir numAdivinar
	
	// Leer datos.
	
	Escribir 'Introduce un n�mero(',numIntentos,' intentos): '
	Leer num
	
	Mientras ((num<>numAdivinar) Y (numIntentos>1)) Hacer
		
		Si numAdivinar>num Entonces
			Escribir 'Bajo. El n�mero al azar es mayor que el introducido.'
			Escribir 'Vuelve a intentarlo (Quedan ',numIntentos,')'
			
		SiNo
			Escribir 'Alto. El n�mero al azar es menor que el introducido.'
			
		FinSi
		
		numIntentos <- numIntentos-1
		
		Escribir 'Te quedan ',numIntentos,' intentos'
		Leer num
		
	FinMientras
	
	
	// Proceso donde tambi�n se muestra los datos.
	
	// *************************UNA FORMA DE HACERLO.**************************
	// Mientras numIntentos > 1 Hacer
	// 		Si num <> numAdivinar Entonces
	// 			numIntentos = numIntentos - 1
	// 			Escribir "Incorrecto. Te quedan ", numIntentos ," intentos"
	// 			Leer num
	// 		SiNo
	// 			Escribir "****** FELICIDADES HAS ACERTADO ******"
	// 			Escribir "EL N�MERO SECRETO ES ", numAdivinar
	// 			numIntentos = 0
	// 			FinSi
	// FinMientras
	
	
	// *************************OTRA FORMA DE HACERLO **************************
	
	Si (numAdivinar=num) Entonces
		escribirMensaje(numAdivinar);
		
	SiNo
		Escribir 'UY, ALGO SALI� MAL.'
		
	FinSi
	
FinAlgoritmo
