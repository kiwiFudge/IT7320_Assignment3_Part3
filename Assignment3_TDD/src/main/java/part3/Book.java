package part3;

public class Book {

	private boolean available;
	private String title;
	
	public void setTitle(String t) {
		this.title = t;
	}
	public String getTitle() {
		return this.title;
	}
	public boolean getAvailable() {
		return this.available;
	}
	
	public void checkIn() {
		this.available = true;		
	}

	public void checkOut() {
		this.available = false;		
	}
}

