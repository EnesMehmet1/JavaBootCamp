
public class PrimeNumberMiniProject {

	public static void main(String[] args) {
		int number=7;
		int remainder=number%2;
		boolean isprime=true;
		
		if(number==1) {
		  System.out.println("Sayı asal değildir");
		  return;
		}
		if(number<1) {
			System.out.println("Geçersiz sayı");
		}
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isprime=false;
			}
		}
		System.out.println(isprime);
	}

}
