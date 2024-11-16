package arrays;

public class OneD_Array {

	public static void main(String[] args) {
       // int arr1[];
        
		int arr1[] = new int[6];    //6 elements    0-5    0   1  2 3 4 5
		arr1[0] = 34;
		arr1[1] = 56;
		arr1[2] = 67;
		arr1[3]   = 89;
		arr1[4]  = 76;
		arr1[5] = 99;
		
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[5]);   //100 array elemtns 
		
		for(int i = 0;i<=5;i++) {
			System.out.println(arr1[i]);   //arr1[0]    //arr1[1]   //arr1[2]   arr1[3]   ..arr1[5]
		}
		

	}

}
