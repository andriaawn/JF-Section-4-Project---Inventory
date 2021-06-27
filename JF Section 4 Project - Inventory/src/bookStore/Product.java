/*
Nama : Andriawan
NIM : 1970231150
*/

package bookStore;

public class Product {
	private int bookId;
	private String bookName;
	private int bookStock;
	private double bookPrice;
	
	//constructor
	public Product() {
	}
	
	public Product(int id, String name, int stock, double price) {
		this.bookId = id;
		this.bookName = name;
		this.bookStock = stock;
		this.bookPrice = price;
	}
	
	//getter for return the value from variable
	public int getBookId() {
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
	
	//setter for set the value to variable
	public void setBookId(int bookId) {
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
	
	public String toString() {
		String test = "";
		test = "Item Number: " + getBookId() + "\r\n"
		+ "Name: " + getBookName() + "\r\n"
		+ "Stock: " + getBookStock() + "\r\n"
		+ "Price: " + getBookPrice() + "\r\n";
		
		return test;
	}
	
	
}
