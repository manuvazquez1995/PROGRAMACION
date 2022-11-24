// Hacer un programa que pida por teclado dos n�meros y que calcule y escriba su
// suma, solamente si los dos son pares y el primero es menor que 50 y el
// segundo est� dentro del intervalo cerrado 100-500. En caso de que no se
// cumpla las condiciones, en vez de la suma, visualizar un mensaje de error.
Algoritmo Ejercicio_6
	// Definir variables e inicializar.
	Definir n1,n2,suma Como Entero
	n1 <- 0
	n2 <- 0
	suma <- 0
	// Se pide los datos.
	Escribir 'Introduzca el primer numero: '
	Leer n1
	Escribir 'Introduzca el segundo n�mero: '
	Leer n2
	// Proceso
	Si ((n1<50) Y ((n2>=50) Y (n2<=500))) Entonces
		Si ((n1 MOD 2=0) Y (n2 MOD 2=0)) Entonces
			suma <- n1+n2
			Escribir 'La suma es: ',suma
		SiNo
			Escribir 'Error, alg�n o algunos de los n� introducidos no cumplen la condici�n.'
		FinSi
	SiNo
		Escribir 'Error, alg�n o algunos de los n� introducidos no cumplen la condici�n.'
	FinSi
FinAlgoritmo
