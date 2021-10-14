package desing.behaivor.mediator;

public abstract class Server {
	
	Mediator mediator;
	String message;

	public Server(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}
	
	public abstract void sendMessage(String message,Server server);
	public abstract void receiveMessage(String message);

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
