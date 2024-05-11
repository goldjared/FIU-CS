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
		int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
		// int[] arr = {10, -3, 0, 4, 7, -2, 10};
		
		System.out.println("Original array: " + Arrays.toString(arr));
		int[] arranged = rearrangePositives(arr);
		System.out.println("Rearranged array: " + Arrays.toString(arranged));
	}
}

