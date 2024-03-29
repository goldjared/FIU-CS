public class DigitSum {
	public static int sumOfDigits(int n) {
		// base case to end recursion
		if(n < 10) return n;
		// modulus to obtain last digit
		int lastDigit = n % 10;
		// int (floored value) to obtain the number without the last digit
		int remainingNum = n / 10;
		// returning int value with lastDigit + recursive call
		return lastDigit + sumOfDigits(remainingNum);
	}
	
	public static void main(String[] args) {
		int sum = sumOfDigits(1234);
		System.out.println(sum);
	}
}
