import java.util.Scanner;

public class Dog {

	public static void main(String[] args) {

		System.out.println("Enter your Position: ");
		Scanner scanner = new Scanner(System.in);
		Dog d = new Dog();
		int Rank = scanner.nextInt();

		String position = scanner.nextLine();

		for (int i = 1; i < 101; i++) {
			if (i == Rank) {
				continue;
			}

			System.out.print(d.calculate(i) + ", ");
		}

	}

	public String calculate(int i) {

		return i % 100 == 11 || i % 100 == 12 || i % 100 == 13 ? i + "th"
				: i + new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" }[i % 10];
	}

}
