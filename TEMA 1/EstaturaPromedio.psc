Algoritmo EstaturaPromedio
	
	Definir contador Como Entero
	Definir estatura Como Entero
	Definir suma Como Entero
	Definir promedio Como Entero
	
	suma <- 0
	contador <- 0
	promedio <- 0
	
	Escribir 'Introducir estatura: '
	Leer estatura
	
	Mientras estatura>0 Hacer
		suma <- suma+estatura
		contador <- contador+1
		Escribir 'Introducir estatura: '
		Leer estatura
	FinMientras
	Si contador=0 Entonces
		Escribir 'No hay estaturas para el cálculo'
	SiNo
		promedio <- suma/contador
		Escribir 'El promedio es: ',promedio
	FinSi
FinAlgoritmo
