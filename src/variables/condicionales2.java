package variables;

public class condicionales2 {
	public static void main(String[] args) {

		int edad = 17;
		int CantidadPersonas = 2;
		boolean sonpareja = true;

//////////////////////operador O or /////////////////////////
		if (edad >= 18 || CantidadPersonas >= 2) {
			System.out.println("Usted puede entrar operador O");
		} else {
			System.out.println("Ud no puede entrar ");
		}
//////////////////// operador y  and//////////////////////////

		if (edad >= 18 && CantidadPersonas >= 2) {
			System.out.println("Usted puede entrar operador y ");
		} else {
			System.out.println("Ud no puede entrar ");
		}
///////////////////// operador boolean ////////////////////////

		if (edad >= 18 || sonpareja) { // en bolean no es explicito colocar == a true o false
			System.out.println("Usted puede entrar operador boolean");
		} else {
			System.out.println("Ud no puede entrar ");
		}

	}

}
