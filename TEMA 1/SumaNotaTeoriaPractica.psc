Algoritmo SumaNotaTeoriaPractica
	// Calcular la nota de N alumnos.
	// Introduciendo su nota teórica (60 MOD ) y su nota práctica (40 MOD )
	// validando los datos (que las nótas sean mayores que cero y como máximo 10 de nota)
	// Mostrarlo por pantalla.
	// Variables.
	
	Definir nAlumnos,i Como Entero
	Definir nTeorica,nPractica,nFinal Como Real
	
	nAlumnos <- 0
	nTeorica <- 0
	nPractica <- 0
	nFinal <- 0
	i <- 0
	
	// Datos de entrada.
	Repetir
		Escribir 'INTRODUCE nALUMNOS: '
		Leer nAlumnos
		
		Si nAlumnos<1 Entonces
			Escribir 'Debe ser mayor que 0.'
		FinSi
		
	Hasta Que nAlumnos>0
	
	// Proceso.
	Para i<-1 Hasta nAlumnos Hacer
		
		Escribir '***************************'
		Escribir i,'º ALUMNO'
		
		Repetir
			
			Escribir 'Nota teórica: '
			Leer nTeorica
			
			Si nTeorica<0 Y nTeorica>10 Entonces
				Escribir 'Nota no válida, vuelva a intentarlo.'
			FinSi
			
		Hasta Que nTeorica>=0 Y nTeorica<=10
		
		Repetir
			
			Escribir 'Nota práctica: '
			Leer nPractica
			
			Si nPractica<0 Y nPractica>10 Entonces
				Escribir 'Nota no válida, vuelva a intentarlo.'
			FinSi
			
		Hasta Que nPractica>0 Y nPractica<=10
		nFinal <- (nTeorica*0.6)+(nPractica*0.4)
		
		// Datos salida.
		Escribir 'NOTA FINAL: ',nFinal
		
	FinPara
	
FinAlgoritmo
