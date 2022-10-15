package Week3.StaticDemo;

public class ProductValidator {           //ana class static olamaz (c#'da oluyor)
	
	static {                                                   //statik yapıcı blok boyle çalısır(birden fazla static blok olusturulabılır
		System.out.println("Statik yapıcı blok çalıltı");
	}
	
	public static boolean isValid(Product product) {                  //methodu static yapdıgınızda class ısmıyle dırek cagırır ve bır kez degısrılıtse her yerde aynı olur
		if(product.price>0&& !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public class BaskaBirClass{     //buna innerclass denir classın ıcerısende bir tane static class (DatabaseHelper da ornegı var)
		public static void Sil() {
			
		}
	}
}
