Algoritmo sumarOmult3nums
	// Dise�ar un algoritmo que pida por teclado tres n�meros; 
	// si el primero es negativo, debe imprimir la multiplicaci�n de los tres 
	// y si no lo es, imprimir� la suma.
	// Variables.
	
	Definir num1,num2,num3,resultado Como Entero
	num1 <- 0
	num2 <- 0
	num3 <- 0
	resultado <- 0
	
	// Leer datos.
	Escribir '*********************************'
	Escribir 'Introduce 3 n�meros para operar: '
	Escribir '*********************************'
	Escribir 'Primer n�mero: '
	Leer num1
	Escribir 'Segundo n�mero: '
	Leer num2
	Escribir 'Tercer n�mero: '
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
