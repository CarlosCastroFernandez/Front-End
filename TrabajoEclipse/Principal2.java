package com.ccastro.prueba2;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("dime tu nombre");
		String nombre= sc.nextLine();
		System.out.println("me alegro de verte hoy "+nombre);
		// Aqui veremos que las letas y los numeros estan relacionados entre si
		//ya que las letras y los numeros de teclado es un numero decimal o binario que le informa al pc
		//char leta='╬';
		//System.out.println(leta);
		//int numero='╬';
		//System.out.println(numero);
		System.out.println("Dime un numero con decimales");
		int n1=sc.nextInt();
		System.out.println("Dime otro numero con decimales");
		int n2=sc.nextInt();
		int resultadoSuma=n1+n2;
		
		System.out.println("La suma de los numeros es: "
		+resultadoSuma);
		System.out.println("el resultado de la multiplicacion es: "+
				(n1*n2));
		System.out.println("Laresta es: " + (n1-n2));
		System.out.println("la division es: "+ (n1/(n2*1f)));
		//AHora veremos el operador modulo 
		//( El modulo nos dice el resto de una division)
		System.out.println("el modulo es: " + (n1%n2));
		//que pasaria si ponemos en vez de float con int:
		//si dividimos por ejemplo 10/4 no nos da el reultado correcto ya que hay decimales
		//por lo que en la division podemos multiplicar por 1f
		//siendo 1f un liteal flotante (float)
		
		
		
		
		
		
		
	}
	
}
	