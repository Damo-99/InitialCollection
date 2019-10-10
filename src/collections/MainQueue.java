package collections;

import java.util.Stack;
import java.util.Queue;

public class MainQueue {

	public static void main(String[] args) {
     
		Stack<Integer> cola = new Stack();
		cola.add(821);
		cola.add(234);
		cola.add(21); 
		
		System.out.println(cola.pop());
		System.out.println(cola.pop());
        System.out.println(cola.pop()); 
      
	}

}
