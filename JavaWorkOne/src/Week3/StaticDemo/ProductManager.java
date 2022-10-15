package Week3.StaticDemo;

public class ProductManager {

	public void add(Product product) {
		if(ProductValidator.isValid(product)) {    //static oldugu için kullandık (ProductValidator)
			System.out.println("Eklendi.");
		}
		else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}

	}
}
