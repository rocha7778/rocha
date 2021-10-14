package desing.behaivor.visitor;

public class Visitor1 implements Visitor {

	@Override
	public void visit(EBusinessWeb ebusinessServer) {
		System.out.println("I want to by books");

	}

	@Override
	public void visit(VideoWeb videWE) {
		// TODO Auto-generated method stub
		System.out.println("I want to watch a movie");

	}

}
