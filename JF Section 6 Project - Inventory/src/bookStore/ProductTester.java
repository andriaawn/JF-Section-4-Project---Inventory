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
			int maxSize = -1;
			
			do {
				try {
					System.out.println("Enter the number of products you would like to add\nEnter 0 (zero) if you do not wish to add products:");
					maxSize = in.nextInt();
					
					if(maxSize < 0)
						throw new Exception("Incorrect Value entered");
				}
				catch(Exception e){
					System.out.println("Incorrect data type entered!");
					in.nextLine();
				}
			} while (maxSize < 0);
			
			in.nextLine();
			
			if(maxSize == 0 ) {
				System.out.println("No products required!");
			}
			else {
				Product[] product = new Product[maxSize];
				
				for(int i = 0; i < maxSize; i++) {
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
					
					product[i] = new Product(tempNumber, tempName, tempQty, tempPrice, tempStatus);
					//System.out.println(product[i]);
					in.nextLine();
				}
				in.close();
				System.out.println("Product inputted!");
				
				for(Product products : product) System.out.println(products);
			}
		}
	}

}
