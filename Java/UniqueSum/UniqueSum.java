package UniqueSum;

import java.util.Scanner;

public class UniqueSum {

	public static void main(String[] args) {

		UniqueSumModel uniqueSumModel = new UniqueSumModel();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please specificy your first number: ");
		int numberone = sc.nextInt();
		System.out.println("Please specificy your second number: ");
		int numbertwo = sc.nextInt();
		System.out.println("Please specificy your third number: ");
		int numberthree = sc.nextInt();

		System.out.println(uniqueSumModel.uniqueSumOperation(numberone,numbertwo,numberthree));
		sc.close();
	}

}
