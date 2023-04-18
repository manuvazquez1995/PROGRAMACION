package Listas_Pilas_Colas.Cine;

public class ListaEnlazada<T>{

    //Atributos
    private Nodo<T> primero;

    /**
     * Constructor por defecto
     */
    public ListaEnlazada(){
        listaVacia();
    }

    /**
     * Vacia la lista
     */
    private void listaVacia(){
        primero = null;
    }

    /**
     * Indica si la lista esta vacia o no
     * @return True = esta vacia
     */
    public boolean estaVacia(){
        return primero == null;
    }

    /**
     * Inserta un objeto al principio de la lista
     * @param t Dato insertado
     */
    public void insertarPrimero(T t){
        Nodo<T> nuevo = new Nodo<>(t);

        if (!estaVacia()){
            //Si no está vacia, el primero actual pasa a ser
            // el siguiente de nuestro nuevo nodo
            nuevo.setSiguiente(primero);
        }

        //el primero apunta al nodo nuevo
        primero=nuevo;

    }

    /**
     * Inserta al final de la lista un objeto
     * @param t Dato insertado
     */
    public void insertarUltimo(T t){

        Nodo<T> aux = new Nodo<>(t);
        Nodo<T> rec_aux;

        if (estaVacia()) {
            insertarPrimero(t);
        }else {
            rec_aux = primero;

            //Buscamos el último nodo
            while(rec_aux.getSiguiente() != null){
                rec_aux=rec_aux.getSiguiente();
            }

            //Actualizamos el siguiente del último
            rec_aux.setSiguiente(aux);
        }
    }

    /**
     * Quita el primer elemento de la lista
     */
    public void quitarPrimero(){
        Nodo<T> aux;
        if (!estaVacia()){
            aux=primero;
            primero = primero.getSiguiente();
            aux=null; //Lo marcamos para el recolector de basura
        }
    }

    /**
     * Quita el ultimo elemento de la lista
     */
    public void quitarUltimo(){
        Nodo<T> aux=primero;
        if(aux.getSiguiente()==null)
            //Aqi entra, si la lista tiene un elemento
            listaVacia();
        if(!estaVacia()) {
            aux=primero;

            //Buscamos el penultimo, por eso hay dos getSiguiente()
            while(aux.getSiguiente().getSiguiente() != null){
                aux=aux.getSiguiente();
            }

            //Marcamos el siguiente del antepenultimo como nulo, eliminando el ultimo
            aux.setSiguiente(null);
        }

    }

    /**
     * Devuelve el último elemento de la lista
     * @return Último elemento
     */
    public T devolverUltimo(){
        T elemen = null;
        Nodo<T> aux;
        if (!estaVacia()){
            aux = primero;

            //Recorremos
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            elemen = aux.getDato();
        }
        return elemen;
    }

    /**
     * Devuelve el primer elemento de la lista
     * @return Primer elemento, null si esta vacia
     */
    public T devolverPrimero(){
        T elemen = null;
        if (!estaVacia()){
            elemen = primero.getDato();
        }
        return  elemen;
    }

    /**
     * Devuelve el número de elementos de la lista
     * @return Número de elementos
     */
    public int cuantosElementos(){
        Nodo<T> aux;
        int numElementos=0;
        aux = primero;

        //Recorremos
        while(aux != null){
            numElementos++;
            aux = aux.getSiguiente();
        }
        return numElementos;

    }

    /**
     * Devuelve el dato del nodo en la posicion pos
     * @param pos
     * @return dato del nodo en la posicion indicada
     */
    public T devolverDato(int pos){
        Nodo<T> aux=primero;
        int cont=0;
        T dato=null;

        if(pos<0 || pos>=cuantosElementos()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            //recorremos
            while(aux!=null){
                if (pos == cont){
                    //Cogemos el dato
                    dato=aux.getDato();
                }

                aux=aux.getSiguiente();
                cont++;

            }
        }

        return dato;

    }

    /**
     * Devuelve el nodo de la posicion indicada
     * @param pos
     * @return Nodo de la posicion indicada
     */
    public Nodo<T> devolverNodo(int pos){
        Nodo<T> aux=primero;
        int cont=0;

        if(pos<0 || pos>=cuantosElementos()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            //recorremos
            while(aux!=null){
                if (pos == cont){
                    //Devuelvo aux, con esto salimos de la función
                    return aux;
                }

                //Actualizo el siguiente
                aux=aux.getSiguiente();
                cont++;

            }
        }

        return aux;

    }

    /**
     * Inserta un nuevo nodo en la posicion indicada con el su dato
     * @param pos
     * @param dato
     */
    public void introducirDato(int pos, T dato){
        Nodo<T> aux=primero;
        Nodo<T> auxDato=null; //Debemos crear un nodo para insetar el dato
        Nodo<T> anterior=primero; //Debemos crear un nodo para insetar el dato

        int contador=0;

        if(pos<0 || pos>cuantosElementos()){
            System.out.println("La posicion insertada no es correcta");
        }else{

            if(pos==0){
                insertarPrimero(dato);
            }else if(pos==cuantosElementos()){
                insertarUltimo(dato);
            }else{
                //Recorremos
                while(aux!=null){
                    if (pos == contador){
                        //Creo el nodo
                        auxDato=new Nodo<>(dato, aux);
                        //El siguiente del anterior a aux es auxDato
                        anterior.setSiguiente(auxDato);
                    }

                    //Actualizo anterior
                    anterior=aux;

                    contador++;
                    aux=aux.getSiguiente(); //Actualizo siguiente
                }
            }
        }

    }

    /**
     * Modifica el dato indicado en el nodo de la posicion indicada
     * @param pos
     * @param dato
     */
    public void modificarDato(int pos, T dato){
        Nodo<T> aux=primero;
        int cont=0;

        if(pos<0 || pos>=cuantosElementos()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            //Recorremos
            while(aux!=null){
                if (pos == cont){
                    //Modificamos el dato directamente
                    aux.setDato(dato);
                }
                cont++;
                aux=aux.getSiguiente(); //Actualizamos
            }
        }

    }

    /**
     * Borra un elemento de la lista
     * @param pos Posición de la lista que queremos borrar
     */
    public void borraPosicion(int pos){

        Nodo<T> aux=primero;
        Nodo<T> anterior=null;
        int contador=0;

        if(pos<0 || pos>=cuantosElementos()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (pos == contador){
                    if (anterior==null){
                        primero = primero.getSiguiente();
                    }else {
                        //Actualizamos el anterior
                        anterior.setSiguiente(aux.getSiguiente());
                    }
                    aux=null;
                }else{
                    anterior=aux;
                    aux=aux.getSiguiente();
                    contador++;
                }
            }
        }
    }

    /**
     * Devuelve el primer el elemento y lo borra de la lista
     * @return Primer elemento
     */
    public T devolverYBorrarPrimero(){

        T dato=devolverPrimero();
        quitarPrimero();
        return dato;
    }

    /**
     * Indica la posición del primer dato que se encuentre
     * @param t dato buscado
     * @return Posición del dato buscado, -1 si no se encuentra o esta vacia
     */
    public int indexOf (T t){

        Nodo<T> aux=primero;
        if (estaVacia()){
            return -1;
        }else{
            int contador=0;
            boolean encontrado=false;

            //recorremos, cuando encontrado=true, sale del bucle
            while(aux!=null && !encontrado){
                if(t.equals(aux.getDato())){
                    //Cambiamos a true
                    encontrado=true;
                }else{
                    contador++;
                    //actualizamos
                    aux=aux.getSiguiente();
                }
            }
            if(encontrado){
                return contador;
            }else{
                //no se ha encontrado
                return -1;
            }
        }
    }

    /**
     * Indica la posición del primer dato desde la posicion indicada
     * @param t dato buscado
     * @param pos
     * @return Posición del dato buscado, -1 si no se encuentra o esta vacia
     */
    public int indexOf (T t, int pos){

        Nodo<T> aux;
        if (estaVacia()){
            return -1;
        }else{
            int contador=pos;
            boolean encontrado=false;

            //Empezamos desde el nodo correspondiente
            aux=devolverNodo(pos);

            //recorremos, cuando encontrado=true, sale del bucle
            while(aux!=null && !encontrado){
                if(t.equals(aux.getDato())){
                    //Cambiamos a true
                    encontrado=true;
                }else{
                    contador++;
                    //Actualizamos
                    aux=aux.getSiguiente();
                }
            }
            if(encontrado){
                return contador;
            }else{
                return -1;
            }
        }
    }

    /**
     * Indica si un dato existe en la lista
     * @param t Dato a comprobar
     * @return Si el dato existe, devuelve true
     */
    public boolean datoExistente(T t){

        boolean existe=false;

        Nodo<T> aux=primero;

        while(aux!=null && !existe){

            if(aux.getDato().equals(t)){
                existe=true;
            }

            //Actualizamos
            aux=aux.getSiguiente();
        }

        return existe;
    }

    /**
     * Muestra el contenido de la lista
     */
    public void mostrar(){
        System.out.println("Contenido de la lista");
        System.out.println("---------------------");

        Nodo<T> aux=primero;

        while(aux!=null){
            System.out.println(aux.getDato().toString());//mostramos el dato
            aux=aux.getSiguiente();
        }

    }

    /**
     * Devuelve el contenido de la lista en un String
     * @return contenido de la lista
     */
    @Override
    public String toString(){

        String contenido="";
        Nodo<T> aux=primero;

        while(aux!=null){
            contenido+=aux.getDato().toString()+"\n"; //guardamos el dato
            aux=aux.getSiguiente();
        }

        return contenido;
    }

}