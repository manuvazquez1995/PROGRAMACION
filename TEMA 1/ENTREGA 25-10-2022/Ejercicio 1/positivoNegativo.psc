//Se pide por teclado un n�mero y que a continuaci�n escriba el mensaje "el
//n�mero le�do es positivo" o bien el mensaje "el n�mero le�do es negativo"
//dependiendo de que el n�mero sea positivo o negativo. Consideramos al
//n�mero cero positivo.

Algoritmo positivoNegativo
	
	//Declaramos e inicializamos las variables.
	Definir r Como Caracter;
	Definir numero como Entero;
	
	r = "";
	num = 0;
	
	//Leemos el n�mero por teclado.
	Escribir "Introduce un n�mero: ";
	Leer numero;
	
	//Procedimiento.
	Si numero >= 0
		r = "El numero leido es positivo.";
		
	SiNo
		r = "El numero leido es negativo."
		
	FinSi
	
	//Mostramos el resultado
	Escribir r;
	
	
FinAlgoritmo
