public class HandShakes {
	public static int totalHandshakes(int n) {
		if(n <= 1) return 0;
		if(n == 2) return 1;
		return n-1 + totalHandshakes(n-1);
	}
	public static void main(String[] args) {
		int n = 5;
		int total = totalHandshakes(n);
		System.out.println("Total number of handshakes for " + n + " people is: " + total);
	}
}
