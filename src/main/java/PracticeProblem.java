public class PracticeProblem {

	public static int sum2D(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	public static int sumRow(int[][] ARR, int num) {
		//Write question 2 code here
		int row = 0;
		int[] lst = ARR[num];
		for (int i = 0; i < lst.length; i++) {
			row += lst[i];
			}
			return row;
		}
		


	public static int sumColumn(int[][] arr1, int x) {
		//Write question 3 code here
		int column = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			column += arr1[i][x];
			}
			return column;
		}
		
	

	
	public static void main(String args[]) {
		int[][] result = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(sum2D(result));
		
		int[][] arrayNum = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int result2 = sumRow(arrayNum, 0);
		System.out.println(result2);

		int[][] arrayList = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int result3 = sumColumn(arrayList, 1);
		System.out.println(result3);
	}


}
