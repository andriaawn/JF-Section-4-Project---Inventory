// Nama : Andriawan
// NIM : 1970231150

package bookStore;

public class Product {
	private String bookId, bookName;
	private int bookStock;
	private double bookPrice;
	private boolean bookActive = true;
	
	//constructor
	public Product() {
	}
	
	public Product(String id, String name, int stock, double price, boolean active) {
		this.bookId = id;
		this.bookName = name;
		this.bookStock = stock;
		this.bookPrice = price;
		this.bookActive = active;
	}
	
	//getter for return the value from variable
	public String getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public int getBookStock() {
		return bookStock;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public boolean getBookActive() {
		return bookActive;
	}
	
	//setter for set the value to variable
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setBookStock(int bookStock) {
		this.bookStock = bookStock;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public void setBookActive(boolean bookActive) {
		this.bookActive = bookActive;
	}
	
	public String toString() {
		String test = "";
		String value1 = "Active";
		String value2 = "Discontinued";
		String value = (this.bookActive) ? value1 : value2;
		
		test = "Item Number: " + getBookId() + "\r\n"
		+ "Name: " + getBookName() + "\r\n"
		+ "Quantity in stock: " + getBookStock() + "\r\n"
		+ "Price: " + getBookPrice() + "\r\n"
		+ "Stock Value: " + getInventoryValue() + "\r\n"
		+ "Product status: " + value + "\r\n";
		
		return test;
	}
		
	double getInventoryValue(){
		double inventoryValue = this.bookPrice*this.bookStock;
		return inventoryValue;
	}
	
}
