// Desarrolle un algoritmo que permita determinar a partir de un n�mero de d�as, 
// ingresado por teclado, �Cu�ntos a�os, meses, semanas y d�as; constituyen el 
// n�mero de d�as proporcionado utilizando la estructura Mientras
Algoritmo AnhosMesesDias
	
	// Definir variables
	Definir numDias,Dias,anhos,meses,semanas Como Entero
	numDias <- 0
	Dias <- 0
	anhos <- 0
	meses <- 0
	semanas <- 0
	Dias <- 0
	
	// Datos de entrada.
	Escribir 'N�mero de d�as: '
	Leer numDias
	Dias <- numDias
	
	// Proceso	
	Mientras Dias>=365 Hacer // A�OS
		anhos <- anhos+1
		Dias <- Dias-365
	FinMientras
	
	Mientras Dias>=30 Hacer // MESES
		meses <- meses+1
		Dias <- Dias-30
	FinMientras
	
	Mientras Dias>=7 Hacer // SEMANAS.
		semanas <- semanas+1
		Dias <- Dias-7
	FinMientras
	
	// Datos de salida.
	Escribir '####################'
	Escribir 'N� A�OS: ',anhos
	Escribir 'N� MESES: ',meses
	Escribir 'N� SEMANAS: ',semanas
	Escribir '####################'
	
FinAlgoritmo
