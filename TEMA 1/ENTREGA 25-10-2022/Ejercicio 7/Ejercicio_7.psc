// Diseñar un programa que calcule importe final de la venta considerando que
// sobre el valor bruto se hace un descuento según la siguiente tabla:
// 		- Valores <=20000 Descuento 0 MOD 
// 		- Valores >20000 y <= 100000 Descuento 5  MOD 
// 		- Valores > 100000 Descuento 10  MOD 

Algoritmo Ejercicio_7
	
	// Declaramos variables e inicializamos.
	Definir valorBruto Como Real
	Definir valorFinal Como Real
	valorBruto <- 0
	valorFinal <- 0
	
	// Pedimos los datos.
	Escribir 'Introduce el valor bruto para el descuento: '
	Leer valorBruto
	
	// Proceso en el que también escribimos los datos.
	Si (valorBruto<=20000) Entonces
		valorFinal <- valorBruto
		Escribir 'No se hace descuento en ventas con valor inferior o igual a 20000.'
		Escribir 'Improte final: ',valorFinal
		
	SiNo
		Si ((valorBruto>20000) Y (valorBruto<=100000)) Entonces
			valorFinal <- valorBruto-(valorBruto*0.05)
			Escribir 'Se hace un descuento del 5%.'
			Escribir 'Importe final: ',valorFinal
			
		SiNo
			valorFinal <- valorBruto-(valorBruto*0.1)
			Escribir 'Se hace un descuento del 10%.'
			Escribir 'Importe final: ',valorFinal
			
		FinSi
		
	FinSi
	
FinAlgoritmo
