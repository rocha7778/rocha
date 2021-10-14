package desing.behaivor.mediator;

public class ServerB extends Server {


	public ServerB(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendMessage(String message,Server server) {
		this.message = message;
		this.getMediator().changed(this,server);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println("ServerB receive message: " + message);
	}

}
