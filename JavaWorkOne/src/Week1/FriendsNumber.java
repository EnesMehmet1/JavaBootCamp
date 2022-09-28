package Week1;

public class FriendsNumber {

	public static void main(String[] args) {
		int Number1=220;
		int Number2=284;
		int Total1=0;
		int Total2=0;
		
		for(int i=1;i<Number1;i++) {
			if(Number1%i==0) {
				Total1=Total1+i;
			}
		}
		for(int i=1;i<Number2;i++) {
			if(Number2%i==0) {
				Total2=Total2+i;;
			}
		}
		if(Number1==Total2&&Number2==Total1) {
			System.out.println("these two numbers are friends");
		}else {
			System.out.println("these two numbers are not friends");
		}
	}

}
