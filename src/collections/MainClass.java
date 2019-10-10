package collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;


public class MainClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	  Integer unEntero;
	  Integer otroEntero = new Integer(2);
	  Integer unTercerEntero = Integer.valueOf("4");
	
	  
	  ArrayList<Integer> lista = new ArrayList();
	  
	  
	  lista.add(otroEntero);
	  lista.add(unTercerEntero);
	  
	  for (Integer entero: lista) {
	  System.out.println(entero);
	  }
	  
	  System.out.println(lista.get(0));
	
	   HashSet<Integer> bolsa = new HashSet<>(); 
	   
	  
	   boolean agregar = true;
	   while(agregar) {
		   System.out.println("Ingrese un numero:");
		   unEntero = in.nextInt();
		   agregar = bolsa.add(unEntero);
		   }
	
	   System.out.println("Ya esta");
	  
	   
	}


}
