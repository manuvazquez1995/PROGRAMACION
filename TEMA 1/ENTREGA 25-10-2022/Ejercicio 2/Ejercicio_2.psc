// Escribir un programa que nos pida por teclado dos números enteros y que
// continuación nos escriba en pantalla la suma de los dos números solamente si
// los dos son positivos. Si no se cumplen que los dos son positivos se visualizará
// un mensaje indicándolo. La salida tiene que tener el formato siguiente:
// Números introducidos: XX, XX
// La suma de los dos números es: XXX
// No se calcula la suma porque algunos de los números o los dos no son positivos.

Algoritmo Ejercicio_2
	
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
		Escribir 'No se calcula la suma porque algunos de los numeros o los dos no son positivos.'
		
	SiNo
		suma <- num1+num2
		Escribir 'Numeros introducidos: ',num1,' , ',num2
		Escribir 'La suma de los dos numeros es: ',suma
		
	FinSi
	
	
FinAlgoritmo
