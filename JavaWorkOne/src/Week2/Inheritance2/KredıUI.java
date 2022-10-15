package Week2.Inheritance2;

public class KredıUI {
	//public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager) {  bunun yerine kalıtım aldıgı sınıfınkını yazmak daha mantıklı!!!!!!!
	public void KrediHesapla(BaseKrediManager baseKrediManager) {
		baseKrediManager.Hesapla();
}
}
