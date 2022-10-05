package Week2;

public class Classes {

	public static void main(String[] args) {
		CustomerManager  customermanager= new CustomerManager();
		CustomerManager  customermanager2= new CustomerManager();
		customermanager=customermanager2;
		customermanager.add();
		customermanager.Update();
		customermanager.Delete();
		
		
		//Value
		int Number1=10;
		int Number2=20;
		Number2=Number1;
		Number1=30;
		System.out.println(Number2);
		
		//DİZİLERDE TURU NE OLURSA OLSUN REFERANS ILE DEWGER AKTARMI OLUR!!!!!
		int[] Numbers1=new int[] {1,2,3};
		int[] Numbers2=new int[] {4,5,6};
		Numbers2=Numbers1;
		Numbers1[0]=10;
		System.out.println(Numbers2[0]);
}
}
