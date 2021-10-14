package desing.behaivor.mediator;

public class TestMediator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwitchMediator sm = new SwitchMediator();
		
		ServerA serverA = new ServerA(sm);
		serverA.setMessage("Hola server C");
		ServerB serverB = new ServerB(sm);
		ServerC serverC = new ServerC(sm);
		ServerD serverD = new ServerD(sm);
		
		
		serverD.sendMessage(serverA.getMessage(),serverC);
//		System.out.println("------------------------------------");
//		serverB.sendMessage("ServerA_Port_200");
//		
//		System.out.println("------------------------------------");
//		serverC.sendMessage("ServerC_Port_201");
	}

}
