package JavaBasics;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}

		for (int a = 6; a >= 0; a--) {
			for (int b = 0; b <= a; b++) {
				System.out.print(" *");
			}
			System.out.println("");
		}

	}
}
