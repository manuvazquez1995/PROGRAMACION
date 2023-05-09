/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML.XstreamEjemplos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mrnov
 */
class PeopleList {

    private List <Person> lista = new ArrayList<Person> ();
	
    public PeopleList() {
	super();
    }

    public void add(Person person) {
    	lista.add(person);
    }

    public List<Person> getList() {
    	return lista;
    }
}  
