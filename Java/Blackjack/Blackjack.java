package Blackjack;

import java.util.*;

public class Blackjack {

	public static void main(String[] args) {

		BlackjackModel blackjackModel = new BlackjackModel();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please specificy your first number: ");
		int numberone = sc.nextInt();
		System.out.println("Please specificy your second number: ");
		int numbertwo = sc.nextInt();


		System.out.println(blackjackModel.blackjackOperation(numberone,numbertwo));
		sc.close();
	}
}
