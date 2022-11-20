package HW6;

public class Computer {
	public int Play() {
		BetMore_Game Bet = new BetMore_Game();
		int x = Bet.pick_card();
		return x;
	}
}
