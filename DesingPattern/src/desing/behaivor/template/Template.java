package desing.behaivor.template;

public abstract class Template {

	public void show() {
		System.out.println("Content of head section");
		System.out.println("Content of left section");
		System.out.println("Content of footer section");
		makeContent();
	}
	
	public abstract void makeContent();

}
