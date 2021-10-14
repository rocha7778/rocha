package desing.behaivor.chaining;

public class FrontHandler implements Handler {

	private Handler nextHanlder;

	public FrontHandler(Handler nextHanlder) {
		super();
		this.nextHanlder = nextHanlder;
	}

	@Override
	public void handleRequest(String reqeuest) {

		if (!"ResignationApply".equals(reqeuest)) {
			System.out.println("Please select one valid operation");
			return;
		}

		System.out.println("Resignation Apply");
		if (nextHanlder == null) {
			System.out.println("There are not more steps");
			return;
		}
		nextHanlder.handleRequest("FinalcialReview");

	}

}
