package part3;

public class Book {

	private boolean available;
	private String title;
	
	public Book() {}
	public Book(String t) {
		this.title = t;
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
	
	public String getTitle() {
		return this.title;
	}
}

