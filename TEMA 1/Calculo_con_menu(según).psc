//// Pedir dos valores numéricos y ver la suma, resta, multiplicación y división.
// UTILIZANDO "SEGÚN" PARA HACER UNA FUNCIÓN DE MENÚ, COMO SI FUESE UN "CASE".
Algoritmo Calculo_con_menu
	Definir var1 Como Real
	Definir var2 Como Real
	Definir op Como Entero
	Definir resultado Como Real
	var1 <- 0
	var2 <- 0
	op <- 0
	resultado <- 0
	// Leemos var1 y var2.
	Escribir 'Introduce el 1º número: '
	Leer var1
	Escribir 'Introduce el 2º número: '
	Leer var2
	// Hacemos una condición según para crear una especie de menú y introducimos una opción con un nº.
	Escribir 'Los números introducidos son el ',var1,' y ',var2
	Escribir '-> Pulsa 1 para SUMAR'
	Escribir '-> Pulsa 2 para RESTAR'
	Escribir '-> Pulsa 3 para MULTIPLICAR'
	Escribir '-> Pulsa 4 para DIVIDIR'
	Leer op
	Segun op  Hacer
		1:
			resultado <- var1+var2
		2:
			resultado <- var1-var2
		3:
			resultado <- var1*var2
		De Otro Modo:
			resultado <- var1/var2
	FinSegun
	Escribir 'El resultado de la operación es: ',resultado
	// Mostramos el resultado.
FinAlgoritmo
