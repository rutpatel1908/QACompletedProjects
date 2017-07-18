package TooHot;

import java.util.Scanner;

public class TooHot {

	public static void main(String[] args) {

		TooHotModel tooHotModel = new TooHotModel();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please specificy your first number: ");
		int numberone = sc.nextInt();
		System.out.println(tooHotModel.summerCheck(numberone, true));
		sc.close();
	}

}
