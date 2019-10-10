package otro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nombre, apellido;
		int i;

		double nota1, nota2;

		Alumno alumnoMejorPromedio;

		Alumno[] misAlumnos = new Alumno[3];
		
		for (i = 0; i < misAlumnos.length; i++) {
			System.out.println("Ingrese un nombre");
			nombre = in.nextLine();

			System.out.println("Ingrese un apellido");
			apellido = in.nextLine();

			misAlumnos[i] = new Alumno(nombre, apellido);
		}

		for (i = 0; i < misAlumnos.length; i++) {
			System.out.println("Ingrese su primer nota");
			nota1 = in.nextDouble();
			
			System.out.println("Ingrese su segunda nota");
			nota2 = in.nextDouble();
			
			misAlumnos[i].setNota1(nota1);
			misAlumnos[i].setNota2(nota2);
			
		}

	}
}
	
