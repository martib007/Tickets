
public class AdvancedTicket extends Ticket{

	private int number;
	private int days;
	private double price;
	
	public AdvancedTicket(int number, int days) {
		super(number);
		this.days = days;
		if (days >= 10) { this.price = 30.00; }
		else { this.price = 40.00; }
	}
	
	public String toString() {
		return "Number: " + number + ", Price: $" + price;
	}
	
	public String getPrice() {
		return "Price: $" + price;
	}
	
}
