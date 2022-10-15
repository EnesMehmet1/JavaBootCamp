package Week3.homework5;

public class MySqlCustomerDal implements ICustomerDal,IRepository{ //birden fazla interfaces implemente edilebilir

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("My sql eklendi");
	}
	
}
