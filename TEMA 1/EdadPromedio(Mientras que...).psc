// Con "MIENTRAS QUE..."
Algoritmo EdadPromedio
	Definir suma Como Entero
	Definir nAlumnos Como Entero
	Definir edadAlumno Como Entero
	Definir c Como Entero
	Definir promedio Como Entero
	// El contador lo inicializamos a 1.
	c <- 1
	// Primero pedimos el nº de alumnos.
	Escribir 'Introducir el nº de alumnos: '
	Leer nAlumnos
	Escribir 'Introduce las edades de ',nAlumnos,' alumnos'
	Mientras c<=nAlumnos Hacer
		edadAlumno <- 0
		Leer edadAlumno
		suma <- suma+edadAlumno
		c <- c+1
	FinMientras
	promedio <- suma/nAlumnos
	Escribir 'La estatura promedio de todos los alumnos es ',promedio
FinAlgoritmo
