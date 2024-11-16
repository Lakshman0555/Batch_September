package arrays;

public class MultiDimensionalArray {

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
		
		for(int i =0;i<=2;i++) {      //0   1  2
			for(int j=0;j<=2;j++) {   //0  1 2  3
				System.out.print(array1[i][j] +" "); //0 2       //11   22   33    //44   55  66    //77  88  99
			}
			System.out.println();
			
		}
		
		int  students[] = {11,22,33,44};
		int students1[][] = {   {11,22}  ,{33,44}   };   //2*2
		int students2[][] = { {1,2,3},{3,4,5},{5,6,7} }; //3*3
		}
		

	}


