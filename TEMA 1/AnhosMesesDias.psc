// Desarrolle un algoritmo que permita determinar a partir de un número de días, 
// ingresado por teclado, ¿Cuántos años, meses, semanas y días; constituyen el 
// número de días proporcionado utilizando la estructura Mientras
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
	Escribir 'Número de días: '
	Leer numDias
	Dias <- numDias
	
	// Proceso	
	Mientras Dias>=365 Hacer // AÑOS
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
	Escribir 'Nº AÑOS: ',anhos
	Escribir 'Nº MESES: ',meses
	Escribir 'Nº SEMANAS: ',semanas
	Escribir '####################'
	
FinAlgoritmo
