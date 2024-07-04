package vv;

import java.util.Scanner;

public class tp48otravez {

	public static void main(String[] args) {

		Scanner datos = new Scanner (System.in);
		
		//echo con arrays. array es un metodo en el que se puede guardar datos de un mismo valor (ej: int) en distintas posiciones que puede llegar a tener
		//(segun el pdf) Un arreglo es una estructura de datos que almacena una colección de
		//elementos del mismo tipo en ubicaciones de memoria contiguas.
		System.out.println("Por favor indique la cantidad de Dnis que desee ingresar: ");
		int cantdnis = datos.nextInt();
		int [] Dnis = new int [cantdnis];
		
		for(int i = 0; i < cantdnis; i++) {
			System.out.println("Porfavor ingrese el dni " + (i+1) + ": ");
			Dnis [i] = datos.nextInt();
		
		}
		for (int i = 0; i < (Dnis.length - 1); i++) {

			for (int j = 0; j < (Dnis.length - i - 1); j++) {
			
				if (Dnis[j] > Dnis[j + 1]) {

					int temporal = Dnis[j];
					
					Dnis[j] = Dnis[j + 1];
					
					Dnis[j + 1] = temporal;
				}
			}
		}
		System.out.println("La lista, ordenada de manera ascendente, queda asi: ");
			for(int i = 0; i < cantdnis ; i++) {
				System.out.println(Dnis [i]);
			}
			
			for (int i = 0; i < (Dnis.length - 1); i++) {

				for (int j = 0; j < (Dnis.length - i - 1); j++) {
				
					if (Dnis[j] < Dnis[j + 1]) {

						int temporal = Dnis[j];
						
						Dnis[j] = Dnis[j + 1];
						
						Dnis[j + 1] = temporal;
					}
				}
			}
			
			System.out.println("Y la lista, ordenada de manera descendente, queda asi: ");
			for(int i = 0; i < cantdnis ; i++) {
				System.out.println(Dnis [i]);
			}
		}
	}


