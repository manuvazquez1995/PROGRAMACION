Algoritmo sumarOmult3nums
	// Diseñar un algoritmo que pida por teclado tres números; 
	// si el primero es negativo, debe imprimir la multiplicación de los tres 
	// y si no lo es, imprimirá la suma.
	// Variables.
	
	Definir num1,num2,num3,resultado Como Entero
	num1 <- 0
	num2 <- 0
	num3 <- 0
	resultado <- 0
	
	// Leer datos.
	Escribir '*********************************'
	Escribir 'Introduce 3 números para operar: '
	Escribir '*********************************'
	Escribir 'Primer número: '
	Leer num1
	Escribir 'Segundo número: '
	Leer num2
	Escribir 'Tercer número: '
	Leer num3
	
	// Proceso.
	Si num1<0 Entonces
		resultado <- num1*num2*num3
	SiNo
		resultado <- num1+num2+num3
	FinSi
	
	// Se muestran los resultados.
	Escribir '********************************'
	Escribir 'RESULTADO: ',resultado
	
FinAlgoritmo
