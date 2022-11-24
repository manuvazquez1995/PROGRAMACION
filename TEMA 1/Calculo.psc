Algoritmo Calculo
	// Pedir dos valores numéricos y ver la suma, resta, multiplicación y división.
	// Primero definimos las variables y asignamos valores.
	Definir var1 Como Real
	Definir var2 Como Real
	Definir suma Como Real
	Definir resta Como Real
	Definir multiplicacion Como Real
	Definir division Como Real
	var1 <- 0
	var2 <- 0
	suma <- 0
	resta <- 0
	multiplicacion <- 0
	division <- 0
	// Leemos var1 y var2.
	Escribir 'Introduce el 1º número: '
	Leer var1
	Escribir 'Introduce el 2º número: '
	Leer var2
	// Hacemos las operaciones..
	suma <- var1+var2
	resta <- var1-var2
	multiplicacion <- var1*var2
	division <- var1/var2
	// Escribimos los resultados.
	Escribir 'La suma es ',suma
	Escribir 'La resta es ',resta
	Escribir 'La multiplicacion es ',multiplicacion
	Escribir 'La division en ',division
FinAlgoritmo
