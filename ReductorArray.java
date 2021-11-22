
public class ReductorArray {

	public static int  comparatorValue(int[] a,int[] b, int d) {
		int count = 0, test = 0;
		for (int i : a) {
			for (int j : b) {
				if (Math.abs(i - j) <= d) {
					test += 1;
				} 
			}
			if (test == 0) {
				count += 1;
			}
			test = 0;
		}
		return count;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1=new int[] {3,1,5};
		int[] arr2=new int[] {5,6,7};
		
		System.out.println(comparatorValue(arr1,arr2,2));
		
		
	}

}
