package Week3.homework1;

public class BaseLogger {      //bu kulllanım şekline overloding yanı uzerıne yazma deniyor
	public void Log(String message) {   //Eğer 4 operasyon için aynı ancak bırı ıcın ayrı bır durum varsa aynı operasyon o classa da yazılır(ornegın databaselogger)
		System.out.println("Logged to Basedatabase "+ message);
	}
}
