package EjercicioDragonBall;

import java.util.Scanner;

public class DragonBall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el nombre de tu primer guerrero");
		String nombre1=sc.nextLine();
		System.out.println("Dime el nombre de tu segundo guerrero");
		String nombre2=sc.nextLine();
		System.out.println("Dime el nivel de poder de tu primer guerrero " + nombre1);
		byte nivelPODER1=sc.nextByte();
		System.out.println("Dime el nivel de poder de tu segundo guerrero "+nombre2);
		byte nivelPODER2= sc.nextByte();
		System.out.println(nombre1 + " Hace un Kaiokenx10 por lo que su poder se incementa a "
				+(nivelPODER1*10));
		System.out.println(nombre2+ " Se convierte en SSJ1 por lo que su poder sera: "
				+ (nivelPODER2*50));
		System.out.println(nombre1 + " Se convierte en SSJ2 por lo que su poder sera: "
				+ (nivelPODER1*100));
		System.out.println(nombre2 + " Se convierte en SSJ2 por lo que su poder sera: "
				+ (nivelPODER2*100));
		System.out.println("los dos guerreros se fusionan " +nombre1+nombre2);
		System.out.println("El poder de  " +nombre1+nombre2 + " es "
		+(nivelPODER1+nivelPODER2)*1.5);
		System.out.println(nombre1+nombre2 + " se transforma en SSJ2" 
				+" y el poder de "+ nombre1+nombre2 + " es " + ((nivelPODER1*100+nivelPODER2*100)*3));
		System.out.println(nombre1+nombre2 + " se fusionan incorrectamente "
				+ " por lo que su poder sera " + (((nivelPODER1/2f)+(nivelPODER2/2f))*0.7));
		System.out.println(nombre1+nombre2 + " Se transforman en SSJ1,por lo que "
				+ "su poder sera "+ ((nivelPODER1*50)+(nivelPODER2*50))/2f);
		System.out.println("la diferencia de poder en SSJ2 entre "+ nombre1+ " y "+ nombre2+
				" sera " + ((nivelPODER1*100) - (nivelPODER2*100)));
	}

}
