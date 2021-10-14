package desing.behaivor.mediator;

public class ServerD extends Server{

	public ServerD(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendMessage(String message, Server server) {
		this.message = message;
		this.getMediator().changed(this,server);
		
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println("ServerC receive message: " + message);
		
	}
	

}
