package desing.behaivor.chaining;

public class HrHandler implements Handler{
	
	private Handler nextHanlder;

	public HrHandler(Handler nextHanlder) {
		super();
		this.nextHanlder = nextHanlder;
	}

	@Override
	public void handleRequest(String reqeuest) {
		
		if (!"Approval".equals(reqeuest)) {
			System.out.println("Please select one valid operation");
			return;
		}
		
		System.out.println("HR Approval");
		if (nextHanlder == null) {
			System.out.println("There are not more steps");
			return;
		}
		
		nextHanlder.handleRequest("ApprovalCompleted");
		
		
	}

}
