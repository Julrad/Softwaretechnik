package HW6;
import java.util.Scanner;

public class Player_2 {
		public int x;
		public Scanner sc = new Scanner(System.in);
		
		public void loop() {
			int i = 0;
			boolean user_selected = false;
			while(user_selected == false && i < 5) {
				Play();
				i++;
				System.out.println("Is this your final Number");
				String answer = sc.nextLine();
				user_selected = Boolean.parseBoolean(answer);
			}
		}
		public void Play() {
			BetMore_Game Bet = new BetMore_Game();
			int x = Bet.pick_card();
			this.x = x;
			System.out.println(x);
		}
		public int Getx(){
			return this.x;
		}
}