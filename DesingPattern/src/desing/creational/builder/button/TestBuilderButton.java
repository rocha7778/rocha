package desing.creational.builder.button;

public class TestBuilderButton {

	public static void main(String[] args) {

		AlertDialog.Builder builder = new AlertDialog.Builder();

		builder.setTitle("Information");
		builder.setMessage("Confirm exit ?");
		builder.setPositiveButton(new Button("Ok"));
		builder.setNagetiveButton(new Button("Cancel"));
		
		AlertDialog dialog = builder.create();
		dialog.show();
		
	}

}
