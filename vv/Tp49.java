package vv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tp49 {

	public static void main(String[] args) {

		Scanner datos = new Scanner (System.in);
		
		List<String> Alumnos = new ArrayList<>();
		List<Integer> notas = new ArrayList<>();
		
		System.out.println("Por favor, inserte la cantidad de alumnos que registrara: ");
		int cantalu = datos.nextInt();
		
		
		for(int i = 0; i < cantalu; i++) {
			System.out.println("Ingrese el apellido y nombre del alumno " + (i+1) + ": " );
			datos.nextLine(); //eSCRIBI ESTO PARA QUE CUANDO EL USUARIO PONGA NOMBRE Y APELLIDO NO ME DE ERROR.
			Alumnos.add(datos.nextLine());//Aca tambien se pone eso. Es que cuando ponia un espacio al ingresar los datos daba error.
			
			System.out.println("Ahora ingrese su calificacion: ");
			notas.add(datos.nextInt());
		}
		
		 for (int i = 0; i < cantalu - 1; i++) {
				for (int j = 0; j < cantalu - i - 1; j++) {
					if (Alumnos.get(j).compareTo(Alumnos.get(j + 1)) > 0) {
 
						String tempalu = Alumnos.get(j);
						Alumnos.set(j, Alumnos.get(j + 1));
						Alumnos.set(j + 1, tempalu);
						
						int tempnota = notas.get(j);
						notas.set(j, notas.get(j + 1));
						notas.set(j + 1, tempnota);

					}
				}
			}
		 
		 System.out.println("Lista ordenada: ");
		 for(int i = 0; i < cantalu; i++) {
			 System.out.println("El alumno " + (i+1) + " que es: " + Alumnos.get(i) + ", tiene de nota un: " + notas.get(i));
		 }
		
	}

}
