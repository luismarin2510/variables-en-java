package variables;

public class ciclos_for2 {

	public static void main(String[] args) {
		System.out.println("metodo de modulo % ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("metodo de suma de 3 en 3");
		for (int i = 3; i < 100; i += 3) {
			System.out.println(i);
		}

	}

}
