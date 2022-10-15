package Week3.homework1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		EmailLogger bl=new EmailLogger();
		bl.Log("add");
		
		BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
		for(BaseLogger logger:loggers) { 
			logger.Log("log message");
		}
		
		
		
		CustomerManager customerManger=new CustomerManager(new DatabaseLogger());
		customerManger.add();
	}

}
