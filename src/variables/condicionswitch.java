package variables;

public class condicionswitch {

	public static void main(String[] args) {

		int mes = 10;

		switch (mes) {
		case 1:
			System.out.println(mes + " Es el mes de Enero");
			break;
		case 2:
			System.out.println(mes + " Es el mes de Febrero");
			break;
		case 3:
			System.out.println(mes + " Es el mes de Marzo");
			break;
		case 4:
			System.out.println(mes + " Es elmes de Abril");
			break;
		case 5:
			System.out.println(mes + " Es el mes de Mayo");
			break;
		case 6:
			System.out.println(mes + " Es el mes de Junio");
			break;
		case 7:
			System.out.println(mes + " Es el mes de Julio");
			break;
		case 8:
			System.out.println(mes + " Es el mes de Agosto");
			break;
		case 9:
			System.out.println(mes + " Es el mes de Septiembre");
			break;
		case 10:
			System.out.println(mes + " Es el mes de Octubre");
			break;
		case 11:
			System.out.println(mes + " Es el mes de Noviembre");
			break;
		case 12:
			System.out.println(mes + " Es el mes de Diciembre");
			break;

		default:
			System.out.println(mes + "No ingresarte un numero correcto ");
			break;
		}
	}

}
