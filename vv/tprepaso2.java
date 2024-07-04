package vv;

import java.util.Scanner;

public class tprepaso2 {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner (System.in);
		
		String [] Apellidos = {"Rosas", "Martinez", "Equice"};

		int [] edad = {28, 23, 31};
		
		int [] DNI = {48114997, 48125345, 49167334};
		
		String [] Marcas = {"BMW", "Peugeot", "Renault"};
		
		String [] Modelo = {"Z3", "208", "Sandero"};
		
		int [] AñoCoche = {2021, 2018, 2022};
		
		String [] Patente = {"AD178JK", "AD200RS", "AD202VW"};
		
		for(int i = 0; i < Apellidos.length; i++) {
		if (AñoCoche[i] >= 2020 && edad[i] >= 25) {
        System.out.println("El auto " + Modelo[i] + " del año " + AñoCoche[i] + ", patente " + Patente[i] + ", pertenece a " + Apellidos[i] + " que tiene " + edad[i] + " y su DNI es " + DNI[i]);
		}
		}
		
		System.out.println("Seleccione una patente para modificar sus datos: ");
		System.out.println("1. AD178JK");
		System.out.println("2. AD200RS");
		System.out.println("3. AD202VW");
		int elegirpa = datos.nextInt();
		
			System.out.println("Que desea modificar de este?:");
			System.out.println("1. Apellido ");
			System.out.println("2. Edad");
			System.out.println("3. Dni");
			System.out.println("4. Marca");
			System.out.println("5. Modelo");
			System.out.println("6. Año");
			System.out.println("7. Patente");
			int opcion = datos.nextInt();
			
			for(int i = 0; i < Apellidos.length; i++) {
			switch (opcion) {
			case 1:
				System.out.println("Ingrese el nuevo apellido: ");
				Apellidos[i] = datos.next();
			break;
			
			case 2: 
				System.out.println("Ingrese la nuevo edad: ");
			    edad[i] = datos.nextInt();
			break;
			
			case 3: 
				System.out.println("Ingrese el nuevo Dni: ");
			    DNI[i] = datos.nextInt();
			break;
			
			case 4: 
				System.out.println("Ingrese el nuevo modelo: ");
				Marcas[i] = datos.next();
			break;
			
			case 5: 
				System.out.println("Ingrese la nueva marca: ");
				Modelo[i] = datos.next();
			break;
			
			case 6: 
				System.out.println("Ingrese el nuevo año: ");
				AñoCoche[i] = datos.nextInt();
			break;
			
			case 7: 
				System.out.println("Ingrese el nuevo año: ");
				Patente[i] = datos.next();
			break;
			
			default:
			System.out.println("Opcion incorrecta");
			break;
			}
			break;
			
			
	}
			for(int i = 0; i < Apellidos.length; i++) {
				if (AñoCoche[i] >= 2020 && edad[i] >= 25) {
		        System.out.println("Ahora la info quedo asi:/nEl auto " + Modelo[i] + " del año " + AñoCoche[i] + ", patente " + Patente[i] + ", pertenece a " + Apellidos[i] + " que tiene " + edad[i] + " y su DNI es " + DNI[i]);
				}
				}
}
}
