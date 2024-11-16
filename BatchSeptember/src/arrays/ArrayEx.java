package arrays;

public class ArrayEx {

	public static void main(String[] args) {
		int[][] JagArray = {
				{1,2,3},
				{4,5},
			    {6,7,8,9}
		};
		
		
		
		for(int i=0;i<=JagArray.length;i++) {   //i<3   0  1  2
			for(int j=0;j<JagArray[i].length;j++) {        // ja[2].length =4  j<4  6  7 8 9
				System.out.print(JagArray[i][j]+" ");
			}
			System.out.println();
		}

	}

}
