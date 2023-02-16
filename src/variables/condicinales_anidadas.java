package variables;

public class condicinales_anidadas {
	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Impuesto a la renta es de 7.5%");
			System.out.println("y puede deducir su declaracion hasta 142");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("Impuesto a la renta es de 15%");
			System.out.println("y puede deducir su declaracion hasta 350");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("Impuesto a la renta es de 22.5%");
			System.out.println("y puede deducir su declaracion hasta 636");
		}
	}

}
