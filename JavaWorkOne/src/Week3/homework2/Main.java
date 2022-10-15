package Week3.homework2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OgretmenKrediManager okm=new OgretmenKrediManager();
		//System.out.println(okm.hesapla(1000));
		
		BaseKrediManager[] krediManagers=new BaseKrediManager[] {
				new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKRediManager()
		};
		
		for(BaseKrediManager krediManager:krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}
	}

}
