package HW6;

public class Game_Chair {
	public int Computer_x;
	public int Player_x;
	public void StartC() {
		Computer Player = new Computer();		
		int Computer_x = Player.Play();
		this.Computer_x = Computer_x;
	}
	public void StartP() {
		Player_2 Player = new Player_2();	
		Player.loop();
		int Player_x = Player.Getx();
		this.Player_x = Player_x;
	}
	public void FindWinner() {
		System.out.println(Computer_x);
		System.out.println(Player_x);
		if(Computer_x > Player_x) {
			System.out.print("Computer ist der Gewinner");
		}if(Computer_x < Player_x) {
			System.out.print("Player ist der Gewinner");
		}if(Computer_x == Player_x) {
			System.out.print("Keiner ist der Gewinner");
		}
	}
}
