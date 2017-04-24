
public class TicketMain {

	public static void main(String[] args) {
		
		AdvancedTicket CarnivalTicket = new AdvancedTicket(1, 14);
		WalkupTicket GiantsGameTicket = new WalkupTicket(1337);
		StudentAdvancedTicket FantasticsTicket = new StudentAdvancedTicket(1679, 5);
		
		System.out.println(CarnivalTicket.getPrice());
		System.out.println(GiantsGameTicket.getPrice());
		System.out.println(GiantsGameTicket.toString());
		System.out.println(FantasticsTicket.toString());
	}

}
