package Week3.StaticDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductManager manager=new ProductManager();
		Product product=new Product();
		product.price=10;
		product.name="Mouse";
		manager.add(product);
		
		
		DatabaseHelper.Connection.createConnection();
	}

}