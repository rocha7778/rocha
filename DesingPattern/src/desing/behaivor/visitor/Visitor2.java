package desing.behaivor.visitor;

public class Visitor2 implements Visitor {

	@Override
	public void visit(EBusinessWeb ebusinessServer) {
		System.out.println("I want to write a review");

	}

	@Override
	public void visit(VideoWeb videWE) {
		// TODO Auto-generated method stub
		System.out.println("I want to download a movie");


	}

}
