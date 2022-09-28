package Week1;

public class SwitchDemo {

	public static void main(String[] args) {
		char Gradge='C';
		switch(Gradge) {
		case 'A':
			System.out.println("Mükkemmel : Geçtiniz");
			break;
			case 'B':
			case 'C':
				System.out.println("orta : Geçtiniz");
				break;
			case 'D':
				System.out.println("Kötü : Kaldınız");
				break;
			case 'F':
				System.out.println("Kötü : Kaldınız");
				break;
		}
	}

}
