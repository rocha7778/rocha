package desing.creational.builder.button;

public class AlertDialog {

	private String title;
	private String message;
	private Button positiveButton; // Ok button
	private Button nagetiveButton; // Cancel Button

	public AlertDialog() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public Button getNagetiveButton() {
		return nagetiveButton;
	}

	public void setNagetiveButton(Button nagetiveButton) {
		this.nagetiveButton = nagetiveButton;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Button getPositiveButton() {
		return positiveButton;
	}

	public void setPositiveButton(Button positiveButton) {
		this.positiveButton = positiveButton;
	}

	public void show() {

		System.out.println(this.title);
		System.out.println(this.message);
		System.out.println(this.positiveButton.getName());
		System.out.println(this.nagetiveButton.getName());
		System.out.println("Popup Alert dialog");

	}

	static class Builder {

		private AlertDialog dialog;

		public Builder() {
			dialog = new AlertDialog();
		}

		public void setTitle(String title) {
			dialog.setTitle(title);
		}
		
		public void setMessage(String message) {
			dialog.setMessage(message);
		}

		public void setNagetiveButton(Button nagetiveButton) {
			dialog.setNagetiveButton(nagetiveButton);
		}

		public void setPositiveButton(Button positiveButton) {
			dialog.setPositiveButton(positiveButton);
		}
		
		public AlertDialog create() {
			return dialog;
		}

	}

}
