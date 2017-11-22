package week.one.day.three.assignments;

import java.util.Scanner;

public class PlayersDemo {

	public static void main(String[] args) {
		Players players[] = new Players[11];
		Scanner sc = new Scanner(System.in);
		int totalScore = 0;
		String name = "";
		int runs;
		for (int i = 0; i < players.length; i++) {
			System.out.println("Enter player-" + (i + 1) + " name : ");
			name = sc.nextLine();
			System.out.println("Enter " + name + " runs : ");
			runs = sc.nextInt();
			sc.nextLine(); // To skip problem with nextLine method
							// required to use with nextLine in line 15.
			Players player = new Players();
			player.setName(name);
			player.setScore(runs);
			players[i] = player;
			totalScore += runs;

		}
		System.out.println("Total Score : " + totalScore);
	}

}
