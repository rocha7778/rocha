package desing.behaivor.command;

public class Stock {
	
	private String name="Blood Pressure";
	private int quantity=10;
	
	
	public void buy() {
		System.out.println("Stock [ Name: "+name+"Quantity: " + quantity +" ] bought");
		
	}
	
	public void sell(){
	      System.out.println("Stock [ Name: "+name+"Quantity: " + quantity +" ] sold");
	   }

}
