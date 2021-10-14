package desing.behaivor.visitor;

public class EBusinessWeb implements Web {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);

	}

}
