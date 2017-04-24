
public class StudentAdvancedTicket extends AdvancedTicket{

	private int number;
	private int days;
	private double price;
	
	public StudentAdvancedTicket(int number, int days) {
		super(number, days);
		this.number = number;
		this.days = days;
		if (days >= 10) { this.price = 15.00; }
		else { this.price = 20.00; }
	}
	
	public String toString() {
		return "Number: " + number + ", Price: $" + price + ", (ID required)";
	}
	
	public String getPrice() {
		return "Price: $" + price;
	}
	
}
