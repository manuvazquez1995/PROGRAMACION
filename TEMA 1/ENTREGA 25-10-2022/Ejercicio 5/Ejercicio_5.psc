//Repetir el ejercicio anterior utilizando una variable de tipo lógico que
//represente si se cumple o no que uno de los dos números es igual a la suma de
//los otros dos.

Algoritmo Ejercicio_5
	
	//Definimos las variables y las inicializamos.
	Definir n1,n2,n3 Como Entero
	Definir sonIguales Como Logico;
	
	n1 <- 0
	n2 <- 0
	n3 <- 0
	sonIguales = Falso;
	
	//Pedimos los datos.
	Escribir 'Introduzca el primer numero: '
	Leer n1
	Escribir 'Introduzca el segundo numero: '
	Leer n2
	Escribir 'Introduzca el tercer numero: '
	Leer n3
	Escribir 'Numeros introducidos: ',n1,' ',n2,' ',n3
	
	//Proceso y mostramos los datos
	Mientras sonIguales=Falso
		Si n1 = n2 + n3
			sonIguales = Verdadero;
			Escribir "Se cumple que N1=N2+N3";
		SiNo
			Si n2 = n1 + n3
				sonIguales = Verdadero;
				Escribir "Se cumple que N2=N1+N3";
			SiNo
				Si n3 = n1 + n2
					sonIguales = Verdadero;
					Escribir "Se cumple que N3=N1+N2";
				SiNo
					sonIguales = verdadero;
					Escribir "Los números no cumplen la condición.";
				FinSi
			FinSi
		FinSi
	FinMientras
	
	
FinAlgoritmo
