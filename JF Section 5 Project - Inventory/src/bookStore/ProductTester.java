// Nama : Andriawan
// NIM : 1970231150

package bookStore;

//import Scanner
import java.util.*;

public class ProductTester {

	public ProductTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner in = new Scanner(System.in)) {
			
		String tempNumber, tempName;
		int tempQty;
		double tempPrice;
		boolean tempStatus = true;

		System.out.println("Enter Book ID \t\t: ");
		tempNumber = in.nextLine();
		System.out.println("Enter Book Name \t: ");
		tempName = in.nextLine();
		System.out.println("Enter Book Stock \t: ");
		tempQty = in.nextInt();
		System.out.println("Enter Book Price \t: ");
		tempPrice = in.nextDouble();
		System.out.println("Enter Book Status \t: ");
		tempStatus = in.nextBoolean();
		System.out.println();
		
		Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice, tempStatus);
		Product p2 = new Product();
		
		Product p3 = new Product();
		p3.setBookId("3");
		p3.setBookName("Hidup Minimalis Ala Orang Jepang");
		p3.setBookStock(11);
		p3.setBookPrice(15);
		p3.setBookActive(false);
		
		Product p4 = new Product();
		p4.setBookId("4");
		p4.setBookName("Bumi Manusia");
		p4.setBookStock(11);
		p4.setBookPrice(20);
		p4.setBookActive(true);
		
		Product p5 = new Product("5", "Nanti Kita Cerita Tentang Hari Ini", 20, 50, true);
		Product p6 = new Product("6", "Negeri Para Bedebah", 15, 26, true);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		}
		
	}

}
