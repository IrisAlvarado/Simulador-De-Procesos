package complements;

import complements.Nodo;

public class Lista {
	
	//Nodo de referencia
	private Nodo inicio;
	//tamaño de la lista
	private int size;
	
	//constructor para inicializar las variables
	public Lista() {
		inicio = null;
		size = 0;
	}
	
	//Metodo para saber si la lista esta vacia
	public boolean isEmpty() {
		return inicio == null;
	}
	
	//Metodo obtener el tamaño de la lista
	public int getSize() {
		return size;
	}
	
	//Metodo para añadir un elemento al final de la lista
	public void addEnd(Object value) {
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.setValue(value);
		
		if (isEmpty()) {
			inicio = nuevoNodo;
		}
		else {
			Nodo auxiliar = inicio;
			while (auxiliar.getNext() != null) {
				auxiliar = auxiliar.getNext();
			}
			auxiliar.setNext(nuevoNodo);
		}
		size++;
	}
	
	//Metodo para añadir un elemento en un lugar determinado de la lista
	public void añadirPosicion(int posicion, Object valor) {
		if(posicion >= 0 && posicion <= size) {
			Nodo nuevoNodo = new Nodo();
			nuevoNodo.setValue(valor);
			
			if(posicion == 0) {
				nuevoNodo.setNext(inicio);
				inicio = nuevoNodo;
			}
			else {
				if(posicion == size) {
					Nodo auxiliar = inicio;
					while (auxiliar.getNext() != null) {
						auxiliar = auxiliar.getNext();
					}
					auxiliar.setNext(nuevoNodo);
				}
				else {
					Nodo auxiliar = inicio;
					
					for (int i = 0; i < (posicion-1); i++) {
						auxiliar = auxiliar.getNext();
					}
					Nodo siguiente = auxiliar.getNext();
					auxiliar.setNext(nuevoNodo);
					nuevoNodo.setNext(siguiente);
				}
			}
			size++;
		}
	}
	
	// Metodo para eliminar elementos de una lista
	public void borrar(int posicion) {
		if(posicion >= 0 && posicion <= size) {
			Nodo auxiliar = inicio;
			if(posicion == 0) {
				auxiliar = inicio.getNext();
				inicio.setValue(null);
				inicio.setNext(null);
				inicio = auxiliar;
			}
			else {
				Nodo auxiliar2 = null;
				for (int i = 0; i <= (posicion-1); i++) {
					auxiliar2 = auxiliar;
					auxiliar = auxiliar.getNext();
				}
				auxiliar2.setNext(auxiliar.getNext());
				auxiliar.setNext(null);
				auxiliar.setValue(null);
			}
			size--;
		}
	}
	
	//Metodo para modificar elementos en la lista
    public void modificar(int posicion , Object valor){
    	
        if(posicion>=0 && posicion<size){            
            if(posicion == 0){
                inicio.setValue(valor);
            }
            else{
                Nodo auxiliar = inicio;
                for (int i = 0; i < posicion; i++) {
                    auxiliar = auxiliar.getNext();
                }
                
                auxiliar.setValue(valor);
            }
        }
    }
    
    //Metodo para eliminar la lista
    public void borrarLista() {
    	Nodo auxiliar;
    	while (inicio.getNext() != null) {
    		auxiliar = inicio.getNext();
    		inicio.setNext(null);
    		inicio.setValue(null);
    		inicio = auxiliar;
    	}
    	inicio.setValue(null);
    	size = 0;
    }
    
    public Object obtenerValor(int posicion) {
    	Nodo auxiliar = inicio;
    	if (posicion == 0) {
    		return inicio.obtenerValor();
    	}
    	else {
    		for (int i = 0; i <= (posicion-1); i++) {
        		auxiliar = auxiliar.getNext();
        	}
        	return auxiliar.obtenerValor();
    	}
    	
    }
}
