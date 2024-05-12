import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
	public static List<Integer> findDoms(int[] n) {
		List<Integer> doms = new ArrayList<>();
		if(n.length < 1) return doms;
		int maxDom = n[n.length - 1];
		doms.add(maxDom);
		
		for(int i = n.length - 2; i>=0; i--) {
			if(n[i] > maxDom) {
				doms.add(0, n[i]);
				maxDom = n[i];
			}
		}
		
		return doms;
	}
	
	public static void main(String[] args) {
		int[] arr0 = {6, 17, 4, 3, 5, 2};
		int[] arr1 = {3, 55, 22, 31, 5};
		int[] arr2 = {3, -55, 6, -5, 5};
		int[] arr3 = {-10, 20, -15, 25, 30};
		int[] arr4 = {100, 524, 200, 50, 75, 300, 0};
		
		List<Integer> ordered = findDoms(arr0);
		System.out.println("Find the Dominant Elements, 5 test cases");
		System.out.println("----------------------------------------------");
		System.out.println("Original array0: " + Arrays.toString(arr0));
		System.out.println("Dominant array0: " + ordered.toString());
		System.out.println("----------------------------------------------");
		
		ordered = findDoms(arr1);
		System.out.println("Original array1: " + Arrays.toString(arr1));
		System.out.println("Dominant array1: " + ordered.toString());
		System.out.println("----------------------------------------------");
		
		ordered = findDoms(arr2);
		System.out.println("Original array2: " + Arrays.toString(arr2));
		System.out.println("Dominant array2: " + ordered.toString());
		System.out.println("----------------------------------------------");
		
		ordered = findDoms(arr3);
		System.out.println("Original array3: " + Arrays.toString(arr3));
		System.out.println("Dominant array3: " + ordered.toString());
		System.out.println("----------------------------------------------");
		
		ordered = findDoms(arr4);
		System.out.println("Original array4: " + Arrays.toString(arr4));
		System.out.println("Dominant array4: " + ordered.toString());
		System.out.println("----------------------------------------------");
	}
}
