package desing.structural.adapter;

public class TestAdapater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plug plug = new StandardPlug();
		System.out.println(plug.recharge() + " too much voltage");
		plug = new AdapterPlug();
		
		System.out.println("Adapter convert into " + plug.recharge() + " voltage.");


	}

}
