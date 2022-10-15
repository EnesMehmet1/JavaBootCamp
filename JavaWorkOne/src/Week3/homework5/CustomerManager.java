package Week3.homework5;

public class CustomerManager {
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	public void add() {
		//iş kodları
		customerDal.add();
	}
}
