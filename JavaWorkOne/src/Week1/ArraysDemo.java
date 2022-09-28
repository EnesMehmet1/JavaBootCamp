package Week1;

public class ArraysDemo {

	public static void main(String[] args) {
		String Students1 ="Engin";
		String Students2 ="Engin1";
		String Students3 ="Engin2";
		String Students4 ="Engin3";
		String Students5="Engin4";
		
		System.out.println(Students1);
		System.out.println(Students2);
		System.out.println(Students3);
		System.out.println(Students4);
		System.out.println(Students5);
		
		System.out.println("----------");
		
		
		String[] Students = new String[5];
		Students[0]="Engin";
		Students[1]="Engin1";
		Students[2]="Engin2";
		Students[3]="Engin3";
		Students[4]="Engin4";
		
		
		for(int i=0;i<Students.length;i++) {
			System.out.println(Students[i]);
		}
		
		for(String Student:Students) {
			System.out.println(Student);
		}
		
	}

}
