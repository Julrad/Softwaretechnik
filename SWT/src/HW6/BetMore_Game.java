package HW6;

public class BetMore_Game {
	public int pick_card() {
		Shuffle s = new Shuffle();
		s.Shuffle();
		int x = s.Getx();
		return x;
	}
}
