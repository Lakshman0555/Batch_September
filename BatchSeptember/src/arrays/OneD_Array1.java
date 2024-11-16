package arrays;

public class OneD_Array1 {

	public static void main(String[] args) {
		String array[] = {"java","javascript","spring","springboot"};   //4 elements
		
		for(int i = 0;i<=3;i++) {
			System.out.println(array[i] + "   first for loop array");
		}
		
		for(int j=0;j<=array.length;j++) {
			System.out.println(array[j] + "  Second for loop array");
		}
		

	}

}
