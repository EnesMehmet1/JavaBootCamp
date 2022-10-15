package Week3.homework3;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	
	public final void gameOver() {     //final oldugu ıcın bunun uzerıne yazılamaz yanı vırutal edılemez
		System.out.println("Oyun Biitti");
	}
}
