package arrays;

public class TwoD_Array {

	public static void main(String[] args) {
		int array1[][] = new int[3][3];
		array1[0][0] = 11;
		array1[0][1] = 22;
		array1[0][2] = 33;
		array1[1][0] = 44;
		array1[1][1] = 55;
		array1[1][2] = 66;
		array1[2][0] = 77;
		array1[2][1] = 88;
		array1[2][2] = 99;
		
		for(int k=0;k<=2;k++) {   //0   //1
			for(int l=0;l<=2;l++) {   //0
				System.out.print(array1[k][l]+" ");   //array1[0][0]   //array1[0][1]  //array1[0][2]
			}
			System.out.println();
		}
		
		int numbers[][] = {{1,2},{3,4}};
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}

	}

}
