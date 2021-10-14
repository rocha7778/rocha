package desing.behaivor.mediator;

public class SwitchMediator implements Mediator{
	

	@Override
	public void changed(Server source, Server destination) {
		destination.receiveMessage(source.getMessage());
	}
	
	
	
	

}
