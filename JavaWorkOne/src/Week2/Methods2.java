package Week2;

public class Methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message="the wealther is very beatifull now";
		String NewMessage=CityGive();
		System.out.println(NewMessage);
		int number=gather(17, 5);
		number=gather2(1,2,3,4,5);
		System.out.println(number);
		
	}
	public static void Add() {
		System.out.println("Add");
	}
	public static void Delete() {
		System.out.println("Delete");
	}
	public static void Update() {
		System.out.println("Update");
	}
	public static int gather(int a,int b) {
		return a+b;
	}
	public static int gather2(int...  number) {
		int gather=0;
		for(int i:number) {
			gather+=i;
		}
		return gather;
	}
	public static String CityGive() {
		return "Ankara";
	}
}
