import java.util.Arrays;

public class Task2 {
	public static int[] rearrangePositives(int[] n) {
		int negCount = 0;
		for (int j : n) {
			if (j < 0) negCount++;
		}
		
		int[] arranged = new int[n.length];
		int negIndex = 0;
		int posIndex = negCount;
		for(int num : n) {
			if(num<0) arranged[negIndex++] = num;
			else arranged[posIndex++] = num;
		}
		return arranged;
	}
	
	public static void main(String[] args) {
		int[] arr0 = {1, -1, 3, 2, -7, -5, 11, 6};
		int[] arr1 = {10, -3, 0, 4, 7, -2, 10};
		int[] arr2 = {3, -55, 6, -5, 5};
		int[] arr3 = {-10, 20, -15, 25, 30};
		int[] arr4 = {100, 200, 50, 75, 300};
		
		System.out.println("Rearrange negative and positive, 5 test cases");
		System.out.println("----------------------------------------------");
		System.out.println("Original array0: " + Arrays.toString(arr0));
		int[] arranged0 = rearrangePositives(arr0);
		System.out.println("Rearranged array0: " + Arrays.toString(arranged0));
		System.out.println("----------------------------------------------");
		
		System.out.println("Original array1: " + Arrays.toString(arr1));
		int[] arranged1 = rearrangePositives(arr1);
		System.out.println("Rearranged array1: " + Arrays.toString(arranged1));
		System.out.println("----------------------------------------------");
		
		System.out.println("Original array2: " + Arrays.toString(arr2));
		int[] arranged2 = rearrangePositives(arr2);
		System.out.println("Rearranged array2: " + Arrays.toString(arranged2));
		System.out.println("----------------------------------------------");
		
		System.out.println("Original array3: " + Arrays.toString(arr3));
		int[] arranged3 = rearrangePositives(arr3);
		System.out.println("Rearranged array3: " + Arrays.toString(arranged3));
		System.out.println("----------------------------------------------");
		
		System.out.println("Original array4: " + Arrays.toString(arr4));
		System.out.println("**No negative values, should be unchanged");
		int[] arranged4 = rearrangePositives(arr4);
		System.out.println("Rearranged array4: " + Arrays.toString(arranged4));
		System.out.println("----------------------------------------------");
	}
}

