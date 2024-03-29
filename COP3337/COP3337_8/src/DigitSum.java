public class DigitSum {
	public static int sumOfDigits(int n) {
		if(n < 10) return n;
		int lastDigit = n % 10;
		int remainingNum = n / 10;
		return lastDigit + sumOfDigits(remainingNum);
	}
	
	public static void main(String[] args) {
		int sum = sumOfDigits(1234);
		System.out.println(sum);
	}
}
