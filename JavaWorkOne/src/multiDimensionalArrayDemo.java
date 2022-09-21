
public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		String[][] Cities=new String[3][3];
		Cities[0][0]="İstanbul";
		Cities[0][1]="Ankara";
		Cities[0][2]="İzmir";
		Cities[1][0]="Manisa";
		Cities[1][1]="Zonguldak";
		Cities[1][2]="Düzce";
		Cities[2][0]="Sakarya";
		Cities[2][1]="Kocaeli";
		Cities[2][2]="Antalya";
		
		for(int i=0;i<=2;i++) {
			System.out.println("--------------------");
			for(int j=0;j<=2;j++) {
				System.out.println(Cities[i][j]);
			}
		}
	}

}
