package desing.behaivor.chaining;

public class FinalcialHandler implements Handler {
	
	private Handler nextHanlder;
	
	

	public FinalcialHandler(Handler nextHanlder) {
		super();
		this.nextHanlder = nextHanlder;
	}



	@Override
	public void handleRequest(String reqeuest) {
		// TODO Auto-generated method stub
		
		if (!"FinalcialReview".equals(reqeuest)) {
			System.out.println("Please select one valid operation");
			return;
		}
		
		System.out.println("Financial Review Completed");
		if (nextHanlder == null) {
			System.out.println("There are not more steps");
			return;
		}
		
		nextHanlder.handleRequest("ManagerReview");
		

	}

}
