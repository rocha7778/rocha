package desing.behaivor.visitor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebServer webServer = new WebServer();
		webServer.attach(new EBusinessWeb());
		webServer.attach(new VideoWeb());

		Visitor visitor1 = new Visitor1();
		webServer.accept(visitor1);
		
		System.out.println("-------------------------");
		
		
	}

}
