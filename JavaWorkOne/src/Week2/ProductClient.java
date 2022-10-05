package Week2;

public class ProductClient {

	public static void main(String[] args) {
		//1
	    Product product2=new Product(1,"Melda","Melda Çelikgöz",1,2,"Red");
	    //2
		Product product =new Product();
		product.setName("Melda");
		product.setId(1);
		product.setDescription("Melda Celikgoz");
		product.setPrice(1);
		product.setStockAmount(1);
		
		ProductManager pm=new ProductManager();
		pm.Add(product);
		System.out.println(product.getCode());
	}

}
