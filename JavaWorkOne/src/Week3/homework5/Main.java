package Week3.homework5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
		customerManager.add();
	}

}
