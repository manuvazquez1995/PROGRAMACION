// Comprobar si un número es primo.

Algoritmo esPrimo
	
	// Variables
	Definir num,i,contador Como Entero
	
	num <- 0
	i <- 0
	contador <- 0
	
	// Datos de entrada
	Escribir 'Introducir un número: '
	Leer num
	
	// Proceso 
	Para i<-1 Hasta num Hacer // Bucle "FOR" para hacer la división de num entre i.
		Si num MOD i==0 Entonces // Si la división da 0 incrementa el contador.
			contador <- contador+1
		FinSi
	FinPara
	
	// Datos de salida
	Si contador=2 Entonces
		Escribir 'PRIMO'
	SiNo
		Escribir 'NO ES PRIMO'
	FinSi
	
FinAlgoritmo
