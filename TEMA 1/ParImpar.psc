// Introducir 1 n�mero y comprobar si es par o impar."
Algoritmo ParImpar
	// Declaramos variables y asignamos valores.
	Definir var Como Entero
	Definir esPar Como Logico
	var <- 0
	esPar <- Verdadero
	// Pedimos el n�mero.
	Escribir 'Introducir un n�mero: '
	Leer var
	// Comprobamos el resto de dividir entre 2.
	Si var MOD 2=0 Entonces
		esPar <- Verdadero
	SiNo
		esPar <- Falso
	FinSi
	Si esPar=Verdadero Entonces
		Escribir 'El ',var,' es PAR'
	SiNo
		Escribir 'El ',var,' es IMPAR'
	FinSi
FinAlgoritmo
