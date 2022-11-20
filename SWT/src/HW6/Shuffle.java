package HW6;

public class Shuffle {
	public int x;

	public void Shuffle() {
		this.x = (int)(Math.random()*100+1);
	}
	public int Getx() {
		return this.x;
	}
}
