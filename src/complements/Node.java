package complements;

//Clase para el manejo de nodos para la implementacion de lista
public class Nodo {
	
	//variable en la que se va a guardar el valor del nodo
	private Object valor;
	//variable para enlazar nodos
	private Nodo siguiente;
	
	//constructor para inicializar los valores de las variables
	public Nodo() {
		this.valor = 0;
		this.siguiente = null;
	}
	
	//metodos set y get para los atributos

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}

	public Node getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}
