package variables;

public class matrix {

	public static void main(String[] args) {

		for (int fila = 0; fila <= 10; fila++) {
			for (int columna = 0; columna <= 10; columna++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int fila = 0; fila <= 10; fila++) {
			for (int columna = 0; columna <= 10; columna++) {
				if (columna >= fila) { /// rompe el ciclo cuando la columna es igual a fila
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int fila = 0; fila <= 10; fila++) {
			for (int columna = 0; columna < fila; columna++) { // se puede usar la condicional dentro del for

				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
