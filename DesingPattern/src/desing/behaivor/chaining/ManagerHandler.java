package desing.behaivor.chaining;

public class ManagerHandler implements Handler {
	
	private Handler nextHanlder;
	
	public ManagerHandler(Handler nextHanlder) {
		super();
		this.nextHanlder = nextHanlder;
	}

	@Override
	public void handleRequest(String reqeuest) {

		if (!"ManagerReview".equals(reqeuest)) {
			System.out.println("Please select one valid operation");
			return;
		}
		
		System.out.println("Manager Review Completed");
		if (nextHanlder == null) {
			System.out.println("There are not more steps");
			return;
		}
		
		nextHanlder.handleRequest("Approval");

	}

	

}
