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
		int[] arr = {6, 17, 4, 3, 5, 2};
		// int[] arr = {3, 55, 22, 31, 5};
		// int[] arr = {3, -55, 6, -5, 5};
		List<Integer> ordered = findDoms(arr);
		System.out.println("Original array: " + Arrays.toString(arr));
		System.out.println("Dominant array: " + ordered.toString());
	}
}
