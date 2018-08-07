package main;

import complements.List;
import complements.Process;
import java.util.Random;

public class ProcessSimulator {
	
	List newProcess = new List();
	List ready = new List();
	List locked = new List();
	List running = new List();
	List outgoing = new List();
	
	public ProcessSimulator() {
		int i[] = new int[4];
		int j[] = new int[4];
		i[0]=1;
		i[1]=1;
		i[2]=1;
		i[3]=1;
		newProcess.addEnd(new Process(i, 3, 3, 3, 3, 3));
		j[0]=0;
		j[1]=1;
		j[2]=0;
		j[3]=0;
		newProcess.addEnd(new Process(j, 3, 2, 3, 3, 3));
		System.out.println(newProcess.getValue(0).toString());
		System.out.println(newProcess.getValue(1).toString());
		newProcess.deleteList();
	}
	
	public Process processManager() {
		Process process = null;
		/*int idProcess [] = new int[4];
		int stateProcess;
		int priority;
		int numberInstructions;
		int blockInstruction;
		int eventNeeded;
		*/
		return process;
	}
	public void newProcessManager() {
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProcessSimulator();
	}
	

}
