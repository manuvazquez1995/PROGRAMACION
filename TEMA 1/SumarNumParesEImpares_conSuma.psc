Algoritmo SumarNumParesEImpares_conSuma
	// Suma_NNumeros_Pares_Impares
	// Definir Variables (y añadimos los acumuladores sumaP, sumaI)
	Definir cantidadNum,num,i,contadorP,contadorI,sumaP,sumaI Como Entero
	cantidadNum <- 0
	num <- 0
	i <- 1
	contadorP <- 0
	contadorI <- 0
	sumaP <- 0 // Para sumar los pares.
	sumaI <- 0 // Para sumar los impares.
	
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
			sumaP <- sumaP+num // Utilizamos acumulador sumaP
		SiNo
			contadorI <- contadorI+1
			sumaI <- sumaI+num // Utilizamos acumulador sumaI
		FinSi
	FinPara
	
	// Datos Salida
	Escribir '******************************'
	Escribir 'PARES: ',contadorP
	Escribir 'Suma de pares: ',sumaP // Mostramos acumulador.
	Escribir '******************************'
	Escribir 'IMPARES: ',contadorI
	Escribir 'Suma de impares: ',sumaI // Mostramos acumulador.
	
FinAlgoritmo
