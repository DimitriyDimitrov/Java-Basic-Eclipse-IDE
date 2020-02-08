import java.util.Scanner;

class Club {
	String name;
	String logo;
	int age;
	int pltitles;
	int chltitles;

	public void setClub(String name, String logo, int age, int pltitles, int chltitles) {
		this.name = name;
		this.logo = logo;
		this.age = age;
		this.pltitles = pltitles;
		this.chltitles = chltitles;
	}

	public String getName() {
		return name;
	}

	public String getLogo() {
		return logo;
	}

	public int getAge() {
		return age;
	}

	public int getPltitles() {
		return pltitles;
	}

	public int getChltitles() {
		return chltitles;
	}

}

class Player {
	String playerName;
	String playerSecondName;
	int matches;
	int goals;
	int titles;
	int number;

	public Player(String playerName, String playerSecondName, int matches, int goals, int titles, int number) {
		this.playerName = playerName;
		this.playerSecondName = playerSecondName;
		this.matches = matches;
		this.goals = goals;
		this.titles = titles;
		this.number = number;
	}

	public String getPlayerName() {
		return playerName;
	}

	public String getPlayerSecondName() {
		return playerSecondName;
	}

	public int getMatches() {
		return matches;
	}

	public int getTitles() {
		return titles;
	}

	public int getGoals() {
		return goals;
	}

	public int getNumber() {
		return number;
	}
}

public class SetterAndThisExampleTwo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Club club1 = new Club();

		String name = "Chelsea Football Club"; // @TODO can remove the code!
		String logo = "Blue Lions";
		//int age = 1905;
		int pltitles = 6;
		int chltitles = 1;
		club1.setClub(name, logo, 1905 , pltitles, chltitles);

		System.out.println(club1.getName());
		System.out.println("Logo is " + club1.getLogo());
		System.out.println("Founded in " + club1.getAge());
		System.out.println("Premier League titles " + club1.getPltitles());
		System.out.println("Champions League titles " + club1.getChltitles());

		System.out.println(); // new line

		String playerName = "Frank";
		String playerSecondName = "Lampard";
		int matches = 648;
		int goals = 211;
		int titles = 13;
		int number = 8;
		Player player1 = new Player(playerName, playerSecondName, matches, goals, titles, number);

		// player1.playerInfo(playerName, playerSecondName, matches, goals, titles,
		// number);

		System.out.println(player1.getPlayerName());
		System.out.println(player1.getPlayerSecondName());
		System.out.println(player1.getMatches() + " matches for Chelsea");
		System.out.println(player1.getGoals() + " goals scored for Chelsea");
		System.out.println(player1.getTitles() + " titles won for Chelsea");
		System.out.println(player1.getNumber() + " was the number on the T-Shirt for Chelsea");

		int one;
		int two;
		int ten;
		int twenty;
		String chelsea;
		int t = 6;

		System.out.println();// new line;

		System.out.println("Who was the club Above");
		String text = s.nextLine();

		switch (text) {
		case "chelsea":
			System.out.println("Yes,you got it! Come on blues!");
			break;
		case "Chelsea":
			System.out.println("Yes,you got it! Come on blues!");
			break;
		default:
			System.out.println("Team not recognized");
		}

		System.out.println(); // new line;

		System.out.println("How many Premier league titles they have?");
		String textTwo = s.nextLine();

		switch (textTwo) {
		case "6":
			System.out.println("Yes,they have won 6 titles!");
			break;
		case "six":
			System.out.println("Yes,they have won 6 titles!");
			break;
		default:
			System.out.println("Wrong Answer!");
		}

		System.out.println(); // new line;

		int task = 0;

		do {
			System.out.println("Which number was Frank Lampard: ");
			task = s.nextInt();

		} while (task != 8);
		System.out.println("London is blue!");

		System.out.println(); // new line;

		for (int i = 0; i < 1; i++) {
			System.out.println("Chelsea Football Club");
		}

		System.out.println(); // new line;
		if (100 > 99) {
			System.out.println("This is the best club in England!");
		} else if (99 > 100) {
			System.out.println("Arsenal is! ");
		}
	}

}
