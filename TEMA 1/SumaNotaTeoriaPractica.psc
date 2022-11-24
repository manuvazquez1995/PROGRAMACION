Algoritmo SumaNotaTeoriaPractica
	// Calcular la nota de N alumnos.
	// Introduciendo su nota te�rica (60 MOD ) y su nota pr�ctica (40 MOD )
	// validando los datos (que las n�tas sean mayores que cero y como m�ximo 10 de nota)
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
		Escribir i,'� ALUMNO'
		
		Repetir
			
			Escribir 'Nota te�rica: '
			Leer nTeorica
			
			Si nTeorica<0 Y nTeorica>10 Entonces
				Escribir 'Nota no v�lida, vuelva a intentarlo.'
			FinSi
			
		Hasta Que nTeorica>=0 Y nTeorica<=10
		
		Repetir
			
			Escribir 'Nota pr�ctica: '
			Leer nPractica
			
			Si nPractica<0 Y nPractica>10 Entonces
				Escribir 'Nota no v�lida, vuelva a intentarlo.'
			FinSi
			
		Hasta Que nPractica>0 Y nPractica<=10
		nFinal <- (nTeorica*0.6)+(nPractica*0.4)
		
		// Datos salida.
		Escribir 'NOTA FINAL: ',nFinal
		
	FinPara
	
FinAlgoritmo
