package desing.behaivor.chaining;


public class TestChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Handler hrHandler = new HrHandler(null);
		Handler managerHandler = new ManagerHandler(hrHandler);
		Handler finalcialHandler = new FinalcialHandler(managerHandler);
		Handler frontHandler = new FrontHandler(finalcialHandler);
		frontHandler.handleRequest("ResignationApply");
	}

}
