// Modificar el ejercicio anterior para que en vez de escribir un mensaje genérico
// en caso de que alguno o los dos números sean negativos, escriba una
// salida diferenciada para cada una de las situaciones que se pueden producir
// utilizando los siguientes mensajes:
// - No se calcula la suma porque el primer número es negativo.
// - No se calcula la suma porque el segundo número es negativo.
// - No se calcula la suma porque los dos números son negativos.

Algoritmo Ejercicio_3
	
	// Declaramos e inicializamos las variables.
	Definir num1,num2,suma Como Entero
	num1 <- 0
	num2 <- 0
	suma <- 0
	
	// Leemos los números por teclado.
	Escribir 'Introduce el primer numero: '
	Leer num1
	Escribir 'Introduce el segundo numero: '
	Leer num2
	
	// Proceso donde también mostramos los datos.
	Si ((num1<0) O (num2<0)) Entonces
		Escribir 'Numeros introducidos: ',num1,' , ',num2
		
		Si ((num1<0) Y (num2<0)) Entonces
			Escribir 'No se calcula la suma porque los dos números son negativos.'
			
		SiNo
			Si ((num1<0) Y (num2>0)) Entonces
				Escribir 'No se calcula la suma porque el primer número es negativo.'
				
			SiNo
				Escribir 'No se calcula la suma porque el segundo número es negativo.'
				
			FinSi
			
		FinSi
		
	SiNo
		suma <- num1+num2
		Escribir 'Numeros introducidos: ',num1,' , ',num2
		Escribir 'La suma de los dos numeros es: ',suma
		
	FinSi
	
FinAlgoritmo
