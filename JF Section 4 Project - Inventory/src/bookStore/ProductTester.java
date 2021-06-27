/*
Nama : Andriawan
NIM : 1970231150
*/

package bookStore;

public class ProductTester {

	public ProductTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product test = new Product(1, "Lelaki Harimau", 10, 4.5);
		System.out.println(test);
		
		Product test1 = new Product(2, "Anak Semua Bangsa", 10, 2.5);
		System.out.println(test1);
		
		Product test2 = new Product();
		test2.setBookId(3);
		test2.setBookName("Hidup Minimalis Ala Orang Jepang");
		test2.setBookStock(11);
		test2.setBookPrice(10);
		System.out.println(test2);
		
		Product test3 = new Product();
		test3.setBookId(4);
		test3.setBookName("Bumi Manusia");
		test3.setBookStock(15);
		test3.setBookPrice(9.9);
		System.out.println(test3);
		
		Product test4 = new Product();
		test4.setBookId(5);
		test4.setBookName("Nanti Kita Cerita Tentang Hari Ini");
		test4.setBookStock(20);
		test4.setBookPrice(5.1);
		System.out.println(test4);
		
		Product test5 = new Product();
		test5.setBookId(6);
		test5.setBookName("Negeri Para Bedebah");
		test5.setBookStock(3);
		test5.setBookPrice(7.4);
		System.out.println(test5);
	}

}
