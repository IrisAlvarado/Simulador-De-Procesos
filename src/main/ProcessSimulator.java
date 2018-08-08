package main;

import complements.List;
import complements.Process;
import java.util.Random;

public class ProcesoSimulador{
	
	List nuevoProceso = new List();
	List listo = new List();
	List bloqueado = new List();
	List ejecutando = new List();
	List saliente = new List();
	
	public ProcesoSimulador() {
		int i[] = new int[4];
		int j[] = new int[4];
		i[0]=1;
		i[1]=1;
		i[2]=1;
		i[3]=1;
		nuevoProceso.addEnd(new Proceso(i, 3, 3, 3, 3, 3));
		j[0]=0;
		j[1]=1;
		j[2]=0;
		j[3]=0;
		nuevoProceso.addEnd(new Proceso(j, 3, 2, 3, 3, 3));
		System.out.println(nuevoProceso.getValue(0).toString());
		System.out.println(nuevoProceso.getValue(1).toString());
		nuevoProceso.borrarLista();
	}
	
	public Proceso GestorProcesos() {
		Proceso proceso = null;
		/*int idProceso [] = new int[4];
		int estadoProceso;
		int prioridad;
		int numInstrucciones;
		int instructionBloqueada;
		int eventoNecesario;
		*/
		return proceso;
	}
	public void nuevoGestorProcesos() {
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProcesoSimulador();
	}
	

}
