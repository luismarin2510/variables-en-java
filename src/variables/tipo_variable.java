package variables;

public class tipo_variable {

	public static void main(String[] arg) {

		System.out.println("Hola Luis ");

		int edad = 31; // variable de tipo entero
		System.out.println(edad);

		edad = 30 + 1; // operacion arimetica
		System.out.println("mi edad es " + edad);

		double salario = 150.52; /* variable de tipo decimal */
		System.out.println("Mi salario es " + salario + " pesos ");

		//////////////// conversions ////////////////////

		//////////////// Casteo o cast ///////////////////

		double variable = 230.89;
		int entero = (int) variable; // casteo
		System.out.println(entero);
	}

}
