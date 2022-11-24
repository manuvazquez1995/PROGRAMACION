// Escribir un programa que pida por teclado tres valores de tipo entero, y que
// calcule si se cumple que la suma de dos de ellos es igual al tercero. La salida del
// programa tiene que tener el formato:
// Números introducidos: N1 N2 N3
// Se cumple que N1=N2+N3
// Se cumple que N2=N1+N3
// Se cumple que N3=N1+N2
// Los números no cumplen la condición
Algoritmo Ejercicio_4
	// Definimos variables y inicializamos.
	Definir n1,n2,n3,suma Como Entero
	n1 <- 0
	n2 <- 0
	n3 <- 0
	suma <- 0
	Escribir 'Introduzca el primer numero: '
	Leer n1
	Escribir 'Introduzca el segundo numero: '
	Leer n2
	Escribir 'Introduzca el tercer numero: '
	Leer n3
	Escribir 'Numeros introducidos: ',n1,' ',n2,' ',n3
	suma <- n2+n3
	Si (n1=suma) Entonces
		Escribir 'Se cumple que N1=N2+N3'
	SiNo
		suma <- n1+n3
		Si (n2=suma) Entonces
			Escribir 'Se cumple que N2=N1+N3'
		SiNo
			suma <- n1+n2
			Si (n3=suma) Entonces
				Escribir 'Se cumple que N3=N1+N2'
			SiNo
				Escribir 'Los números no cumplen la condición'
			FinSi
		FinSi
	FinSi
FinAlgoritmo
