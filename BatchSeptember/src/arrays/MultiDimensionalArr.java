package arrays;

public class MultiDimensionalArr {

	public static void main(String[] args) {
	int Numbers[][] = new int[3][3];
	Numbers[0][0] = 456;
	Numbers[0][1] = 678;
	Numbers[0][2] = 445;
	Numbers[1][0] = 666;
	Numbers[1][1] = 456;
	Numbers[1][2] = 678;
	Numbers[2][0] = 445;
	Numbers[2][1] = 666;
	Numbers[2][2] = 678;
	
	
	for(int i =0;i<=2;i++) {       //0
		for(int j=0;j<=2;j++) {  //0 //1
			System.out.print(Numbers[i][j]+ " ");  //to print side by side columns   Numbers[0][0]   Numbers[0][1]
		}
		System.out.println();  //next row 
	}
	
	int arr1[][]  = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	for(int i =0;i<=2;i++) {       //0
		for(int j=0;j<=2;j++) {  //0 //1
			System.out.print(arr1[i][j]+ " ");  //to print side by side columns   Numbers[0][0]   Numbers[0][1]
		}
		System.out.println();  //next row 
	}

	}

}
