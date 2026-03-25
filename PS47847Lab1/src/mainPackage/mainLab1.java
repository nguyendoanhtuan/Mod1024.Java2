package mainPackage;
import java.util.ArrayList;
import entity.*;

public class mainLab1 {
	public static void main(String[] args) {
		ArrayList<Product> listProduct = new ArrayList<Product>();
		
		Product p1 = new Product("AO01", "Ao Thun ",10);
		listProduct.add(p1);
		listProduct.add(new Product("Ao02","Ao thun",-12));
		listProduct.add(new ImportedProduct("Q01","Quan Tay",15,0.1,1));
		listProduct.add(new ImportedProduct("Q02","Quan Thun",12,0.15,1));
		listProduct.add(new ImportedProduct("Q03","Quan Jean",15,0.1,1));
		
		for(Product p : listProduct) {
			System.out.println(p.toString());
		}
	}
}
