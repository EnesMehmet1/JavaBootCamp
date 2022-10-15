package Week2.Inheritance2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KredıUI krediUI=new KredıUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new TarimKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
