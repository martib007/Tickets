
public abstract class Ticket {
	
	private int number;
	
	public Ticket(int number) {
		this.number = number;
	}
	
	public abstract String getPrice();
	
	public abstract String toString();
}
