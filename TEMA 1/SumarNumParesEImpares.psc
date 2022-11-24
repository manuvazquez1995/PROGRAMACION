Algoritmo SumarNumParesEImpares
	// Suma_NNumeros_Pares_Impares
	
	// Definir Variables
	Definir cantidadNum, num, i, contadorP, contadorI Como Entero
	
	cantidadNum <- 0
	num <- 0
	i <- 1
	contadorP <- 0
	contadorI <- 0
	
	// Datos Entrada
	Escribir 'Introducir la cantidad de números: '
	Leer cantidadNum
	
	// Proceso 
	// ciclo Mientras/Para
	Para i<-1 Hasta cantidadNum Hacer
		
		Escribir 'Número: ',i
		Leer num
		
		// Validar condición en un Si-Entonces
		Si num MOD 2=0 Entonces
			contadorP <- contadorP+1
			
		SiNo
			contadorI <- contadorI+1
			
		FinSi
		
	FinPara
	
	// Datos Salida
	Escribir 'PARES: ',contadorP
	Escribir 'IMPARES: ',contadorI
	
FinAlgoritmo
