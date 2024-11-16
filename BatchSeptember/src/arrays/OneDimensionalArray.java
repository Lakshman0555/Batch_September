package arrays;

public class OneDimensionalArray {
	
	public static void main(String[] args) {

	int arr[] = new int[11];
	arr[0] = 11;
	arr[1] = 22;
	arr[2] = 33; 
	arr[3] = 44;
	arr[4] = 55;
	arr[5] = 66;
	arr[6] = 77;
	arr[7] = 88;
	arr[8] = 99;
	arr[9] = 100;
	arr[10] = 111;
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	
	for(int i:arr ) {
		System.out.println(i);
	}
	for(int k =0;k<=10;k++) {
		System.out.println(arr[k]);
	}
	
	String names[] = {"sai","karthik","suresh","satish","suman"};
	System.out.println(names[2]);
	for(String n:names) {
		System.out.println(n);
	}
	}

}
