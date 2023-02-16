package variables;

public class ciclo_while_for {

	public static void main(String[] args) {

		int contador = 0;
		int suma = 0;

		System.out.println("aqui empieza while");
		while (contador < 10) {

			System.out.println(contador);
			// contador = contador +1;
			contador++;
			suma = suma + contador;
		}
		System.out.println(suma);

		System.out.println("aqui empieza for");

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);

		}

	}
}
