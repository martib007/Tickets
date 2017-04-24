
public class WalkupTicket extends Ticket{
	
	private int number;
	private double price = 50.00;

	public WalkupTicket(int number) {
		super(number);
		this.number = number;
	}
	
	public String toString() {
		return "Number: " + number + ", Price: $" + price;
	}
	
	public String getPrice() {
		return "Price: $" + price;
	}
	
}