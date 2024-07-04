package vv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tprepaso {

	public static void main(String[] args) {

		Scanner datos = new Scanner (System.in);
		
		 List<Integer> DNIS = new ArrayList<>();	
		 List<String> Apellidos = new ArrayList<>();
		 
		 System.out.println("Ingrese la cantidad de usuarios que almacenara: ");
		 int cantusu = datos.nextInt();
		 
		 for (int i = 0; i < cantusu; i++) {
			 System.out.println("Ingrese el Dni numero " + (i+1) + " del usuario " + (i+1) + ": ");
			 DNIS.add(datos.nextInt());
			 
			 System.out.println("Ahora ingrese el apellido de ese usuario : ");
			 Apellidos.add(datos.next());		
			 }
		 
		 for (int i = 0; i < cantusu - 1; i++) {
				for (int j = 0; j < cantusu - i - 1; j++) {
					if (DNIS.get(j) > DNIS.get(j + 1)) {
						// Intercambiar DNI
						int tempDNI = DNIS.get(j);
						DNIS.set(j, DNIS.get(j + 1));
						DNIS.set(j + 1, tempDNI);

						// Intercambiar apellidos
						String tempApellido = Apellidos.get(j);
						Apellidos.set(j, Apellidos.get(j + 1));
						Apellidos.set(j + 1, tempApellido);
					}
				}
			}
		 
		 System.out.println("La lista de usuarios queda asi: ");
		 for(int i = 0; i < DNIS.size(); i++) {
			 System.out.println("El dni numero " + (i+1) + ", que es: " + DNIS.get(i) + " le pertenece a: " + Apellidos.get(i));
		 }
		 
		 boolean buscarOtro = true;
		 
		 while (buscarOtro == true) {
		 System.out.println("Ahora, porfavor ingrese el numero de dni que desee buscar: ");
		 int Numdni = datos.nextInt();
		 
		 boolean encontrado = false;
		 
		 for (int i = 0; i < DNIS.size(); i++) {
		 if (Numdni == DNIS.get(i)) {
			 encontrado = true;
			 System.out.println("El dni que ingreso es " + DNIS.get(i) + " y le pertenece a: " + Apellidos.get(i));
			 
			 System.out.println("Ahora, porfavor indique que desea hacer con dicho dni: ");
			 System.out.println("1. Eliminar");
			 System.out.println("2. Modificar");
			 System.out.println("3. Salir del programa");
			 int opcion = datos.nextInt();
			 
			 switch (opcion){
			 case 1:
				 DNIS.remove(i);
				 Apellidos.remove(i);
				 System.out.println("A eliminado correctamente al usuario");
				 System.out.println("La lista de usuarios queda asi: ");
				 for(int j = 0; j < DNIS.size(); j++) {
					 System.out.println("El dni numero " + (j+1) + ", que es: " + DNIS.get(j) + " le pertenece a: " + Apellidos.get(j));
				 }
				 break;
			 case 2:
				 System.out.println("Desea modificar...");
				 System.out.println("1. Dni");
				 System.out.println("2. Apellido");
				 System.out.println("3. Ambos");
				 int respuesta = datos.nextInt();
				 
				 if (respuesta == 1 ||respuesta == 3) {
					 System.out.println("Ingrese el nuevo dni: ");
					 int Ndni = datos.nextInt();
					 DNIS.set(i, Ndni);
				 }
				 if (respuesta == 2 ||respuesta == 3) {
					 System.out.println("Ingrese el nuevo apellido: ");
					 String Nape = datos.next();
					 Apellidos.set(i, Nape);
				 }
				 
				 System.out.println("La lista ahora queda asi: ");
				 for(int j = 0; j < DNIS.size(); j++) {
					 System.out.println("El dni numero " + (j+1) + ", que es: " + DNIS.get(j) + " le pertenece a: " + Apellidos.get(j));
					
				 }
				  break;
			 case 3: 
				 System.out.println("Saliendo del programa...");
				 buscarOtro = false;
				 
				 break;
				 
			 default:
					System.out.println("Opcion no valida");
				 break;
			 
			 }
			 break;
		  }
		 }
			 if (encontrado == false){
				 System.err.println("El dni que busca no existe");
			 }
				 
			
		     
			  System.out.println("¿Desea salir? S/N ");
			  String respuesta = datos.next();
			  
			  if(respuesta.equalsIgnoreCase("s")) {
				  buscarOtro = false;
			  }
		 }
			
			  System.out.println("A finalizado el programa");
			  
			  
		 }
		 }
		
		 
	


