package Week3.homework4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager cm=new CustomerManager();
		cm.databaseManager=new MySqlDatabaseManager();
		cm.getCustomers();
	}

}
