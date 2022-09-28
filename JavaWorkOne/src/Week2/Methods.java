package Week2;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number =new int[] {1,2,5,7,0};
		 boolean n=false;
		int call=6;
		for(int i : number) {
			if(call==i) {
				n=true;
			}
		}
		String mes="";
		if(n) {
			mes="yeah " + call;
			message(mes);
			
		}
		else {
			mes="shit " + call;
		message(mes);
	}
	}
	
	public static void message(String message) {
		System.out.println(message);
	}

}
