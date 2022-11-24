// Se pide por teclado un número y que a continuación escriba el mensaje "el
// número leído es positivo" o bien el mensaje "el número leído es negativo"
// dependiendo de que el número sea positivo o negativo. Consideramos al
// número cero positivo.

Algoritmo positivoNegativo
	
	// Declaramos e inicializamos las variables.
	
	Definir r Como Caracter
	Definir numero Como Entero
	
	r <- ''
	num <- 0
	
	// Leemos el número por teclado.
	
	Escribir 'Introduce un número: '
	Leer numero
	
	// Procedimiento.
	
	Si numero>=0 Entonces
		r <- 'Positivo'
		
	SiNo
		r <- 'Negativo'
		
	FinSi
	
	// Mostramos el resultado
	
	Escribir r
	
FinAlgoritmo
