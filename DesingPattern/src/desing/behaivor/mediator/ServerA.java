package desing.behaivor.mediator;

public class ServerA extends Server {


	public ServerA(Mediator mediator) {
		super(mediator);

	}

	@Override
	public void sendMessage(String message,Server server) {
		server.setMessage(message);
		this.getMediator().changed(this,server);
	}


	@Override
	public void receiveMessage(String message) {
		System.out.println("ServerA receive message: " + message);

	}

}
