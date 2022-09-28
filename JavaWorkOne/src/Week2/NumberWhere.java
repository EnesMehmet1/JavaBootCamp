package Week2;

public class NumberWhere {

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
		if(n) {
			System.out.println("yeah");
		}
		else
			System.out.println("shit");
}}
