package desing.behaivor.template;

public class TestTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Template template = new LoginPage();
		template.show();
		
		System.out.println("-------------------------");

		template = new BookPage();
		template.show();

	}

}
