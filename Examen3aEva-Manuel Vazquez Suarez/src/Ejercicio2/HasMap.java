package Ejercicio2;

import examen.Biblioteca.POJOS.Biblioteca;

public class HasMap {


    public void main(String[] args) {

        // Inicializamos la pila donde se guardara la biblioteca.
        ListaEnlazada<Biblioteca> cola = new ListaEnlazada<>();

        cola.introducirDato(0, cola);


    }





    // TODO: CLASE NODO
    public class Nodo<T>{

        private T dato;
        private Nodo<T> siguiente;

        public Nodo(){
            siguiente=null;
        }

        public Nodo(T p){
            siguiente=null;
            dato = p;
        }

        public Nodo(T t, Nodo<T> siguiente){
            this.siguiente=siguiente;
            dato = t;
        }

        public T getDato() {
            return dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public Nodo<T> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo<T> siguiente) {
            this.siguiente = siguiente;
        }

    }


    // TODO: CLASE LISTAENLAZADA.
    public class ListaEnlazada<T> {

        //Atributos
        private Nodo<T> primero;


        public ListaEnlazada() {
            listaVacia();
        }


        private void listaVacia() {
            primero = null;
        }


        public boolean estaVacia() {
            return primero == null;
        }


        public void insertarPrimero(T t) {
            Nodo<T> nuevo = new Nodo<>(t);

            if (!estaVacia()) {
                //Si no está vacia, el primero actual pasa a ser
                // el siguiente de nuestro nuevo nodo
                nuevo.setSiguiente(primero);
            }

            //el primero apunta al nodo nuevo
            primero = nuevo;

        }


        public void insertarUltimo(T t) {

            Nodo<T> aux = new Nodo<>(t);
            Nodo<T> rec_aux;

            if (estaVacia()) {
                insertarPrimero(t);
            } else {
                rec_aux = primero;

                //Buscamos el último nodo
                while (rec_aux.getSiguiente() != null) {
                    rec_aux = rec_aux.getSiguiente();
                }

                //Actualizamos el siguiente del último
                rec_aux.setSiguiente(aux);
            }
        }


        public void quitarPrimero() {
            Nodo<T> aux;
            if (!estaVacia()) {
                aux = primero;
                primero = primero.getSiguiente();
                aux = null; //Lo marcamos para el recolector de basura
            }
        }


        public void quitarUltimo() {
            Nodo<T> aux = primero;
            if (aux.getSiguiente() == null)
                //Aqi entra, si la lista tiene un elemento
                listaVacia();
            if (!estaVacia()) {
                aux = primero;

                //Buscamos el penultimo, por eso hay dos getSiguiente()
                while (aux.getSiguiente().getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }

                //Marcamos el siguiente del antepenultimo como nulo, eliminando el ultimo
                aux.setSiguiente(null);
            }

        }


        public T devolverUltimo() {
            T elemen = null;
            Nodo<T> aux;
            if (!estaVacia()) {
                aux = primero;

                //Recorremos
                while (aux.getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }
                elemen = aux.getDato();
            }
            return elemen;
        }


        public T devolverPrimero() {
            T elemen = null;
            if (!estaVacia()) {
                elemen = primero.getDato();
            }
            return elemen;
        }


        public int cuantosElementos() {
            Nodo<T> aux;
            int numElementos = 0;
            aux = primero;

            //Recorremos
            while (aux != null) {
                numElementos++;
                aux = aux.getSiguiente();
            }
            return numElementos;

        }


        public T devolverDato(int pos) {
            Nodo<T> aux = primero;
            int cont = 0;
            T dato = null;

            if (pos < 0 || pos >= cuantosElementos()) {
                System.out.println("La posicion insertada no es correcta");
            } else {
                //recorremos
                while (aux != null) {
                    if (pos == cont) {
                        //Cogemos el dato
                        dato = aux.getDato();
                    }

                    aux = aux.getSiguiente();
                    cont++;

                }
            }

            return dato;

        }


        public Nodo<T> devolverNodo(int pos) {
            Nodo<T> aux = primero;
            int cont = 0;

            if (pos < 0 || pos >= cuantosElementos()) {
                System.out.println("La posicion insertada no es correcta");
            } else {
                //recorremos
                while (aux != null) {
                    if (pos == cont) {
                        //Devuelvo aux, con esto salimos de la función
                        return aux;
                    }

                    //Actualizo el siguiente
                    aux = aux.getSiguiente();
                    cont++;

                }
            }

            return aux;

        }


        public void introducirDato(int pos, ListaEnlazada<Biblioteca> dato) {
            Nodo<T> aux = primero;
            Nodo<T> auxDato = null; //Debemos crear un nodo para insetar el dato
            Nodo<T> anterior = primero; //Debemos crear un nodo para insetar el dato

            int contador = 0;

            if (pos < 0 || pos > cuantosElementos()) {
                System.out.println("La posicion insertada no es correcta");
            } else {

                if (pos == 0) {
                    insertarPrimero(dato);
                } else if (pos == cuantosElementos()) {
                    insertarUltimo(dato);
                } else {
                    //Recorremos
                    while (aux != null) {
                        if (pos == contador) {
                            //Creo el nodo
                            auxDato = new Nodo<>(dato, aux);
                            //El siguiente del anterior a aux es auxDato
                            anterior.setSiguiente(auxDato);
                        }

                        //Actualizo anterior
                        anterior = aux;

                        contador++;
                        aux = aux.getSiguiente(); //Actualizo siguiente
                    }
                }
            }

        }


        public void modificarDato(int pos, T dato) {
            Nodo<T> aux = primero;
            int cont = 0;

            if (pos < 0 || pos >= cuantosElementos()) {
                System.out.println("La posicion insertada no es correcta");
            } else {
                //Recorremos
                while (aux != null) {
                    if (pos == cont) {
                        //Modificamos el dato directamente
                        aux.setDato(dato);
                    }
                    cont++;
                    aux = aux.getSiguiente(); //Actualizamos
                }
            }

        }


        public void borraPosicion(int pos) {

            Nodo<T> aux = primero;
            Nodo<T> anterior = null;
            int contador = 0;

            if (pos < 0 || pos >= cuantosElementos()) {
                System.out.println("La posicion insertada no es correcta");
            } else {
                while (aux != null) {
                    if (pos == contador) {
                        if (anterior == null) {
                            primero = primero.getSiguiente();
                        } else {
                            //Actualizamos el anterior
                            anterior.setSiguiente(aux.getSiguiente());
                        }
                        aux = null;
                    } else {
                        anterior = aux;
                        aux = aux.getSiguiente();
                        contador++;
                    }
                }
            }
        }


        public T devolverYBorrarPrimero() {

            T dato = devolverPrimero();
            quitarPrimero();
            return dato;
        }

        public int indexOf(T t) {

            Nodo<T> aux = primero;
            if (estaVacia()) {
                return -1;
            } else {
                int contador = 0;
                boolean encontrado = false;

                //recorremos, cuando encontrado=true, sale del bucle
                while (aux != null && !encontrado) {
                    if (t.equals(aux.getDato())) {
                        //Cambiamos a true
                        encontrado = true;
                    } else {
                        contador++;
                        //actualizamos
                        aux = aux.getSiguiente();
                    }
                }
                if (encontrado) {
                    return contador;
                } else {
                    //no se ha encontrado
                    return -1;
                }
            }
        }


        public int indexOf(T t, int pos) {

            Nodo<T> aux;
            if (estaVacia()) {
                return -1;
            } else {
                int contador = pos;
                boolean encontrado = false;

                //Empezamos desde el nodo correspondiente
                aux = devolverNodo(pos);

                //recorremos, cuando encontrado=true, sale del bucle
                while (aux != null && !encontrado) {
                    if (t.equals(aux.getDato())) {
                        //Cambiamos a true
                        encontrado = true;
                    } else {
                        contador++;
                        //Actualizamos
                        aux = aux.getSiguiente();
                    }
                }
                if (encontrado) {
                    return contador;
                } else {
                    return -1;
                }
            }
        }


        public boolean datoExistente(T t) {

            boolean existe = false;

            Nodo<T> aux = primero;

            while (aux != null && !existe) {

                if (aux.getDato().equals(t)) {
                    existe = true;
                }

                //Actualizamos
                aux = aux.getSiguiente();
            }

            return existe;
        }


        public void mostrar() {
            System.out.println("Contenido de la lista");
            System.out.println("---------------------");

            Nodo<T> aux = primero;

            while (aux != null) {
                System.out.println(aux.getDato().toString());//mostramos el dato
                aux = aux.getSiguiente();
            }

        }

        @Override
        public String toString() {

            String contenido = "";
            Nodo<T> aux = primero;

            while (aux != null) {
                contenido += aux.getDato().toString() + "\n"; //guardamos el dato
                aux = aux.getSiguiente();
            }

            return contenido;
        }
    }




}