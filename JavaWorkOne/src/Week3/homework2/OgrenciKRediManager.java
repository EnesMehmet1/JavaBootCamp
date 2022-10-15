package Week3.homework2;

public class OgrenciKRediManager extends BaseKrediManager{     //c# dakı vırtual burada overriding oluyo aynı methodu extend edılen sınıftakını yanı bıradaha yazıyruz ve bu uzerıne yazıldıgı ıcın
	public double hesapla(double tutar) {                      //bu kullanılır
		return tutar*1.10;
	}
}


//bu durumu yapabılıyoruz ama yapılmamasını ıstersek eger basekredımanager de publıc double arasına fınal yazabılrısın 
//bu durum bunu ezemessin demek oluyor