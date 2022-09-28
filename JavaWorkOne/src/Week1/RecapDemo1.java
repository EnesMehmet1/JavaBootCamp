package Week1;

public class RecapDemo1 {

	public static void main(String[] args) {
			int number=12;
			int number2=134;
			int number3=1;
			int biggest=number;
			
			if(biggest<number2) {
				biggest=number2;
			}
			else if(biggest<number3) {
				biggest=number3;
			}
			System.out.println(biggest);

	}

}
