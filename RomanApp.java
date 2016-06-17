package src;

public class RomanApp {

	public static String numberConvert(int number) {
		
		return "nothing";
	}

	public static int findLength(Integer number) {
		return number.toString().length();
	}
	
	public static int isolateDigit(int number, int position) {
		double doublePosition = (double) position;
		double doubleNumber = (number / Math.pow(10, doublePosition-1))%10;
		int x = (int) doubleNumber;
		return x;
		
	}

	public static String oneDigitConvert(int digit, int position) {
		String romanDigit = "";
		String one = "I";
		String five = "V";
		String ten = "X";

		if (position < 10) {
			if (digit == 4)
				return romanDigit + one + five;
			if (digit == 9)
				return romanDigit + one + ten;
			if (digit == 5)
				return romanDigit + five;
			if (digit > 5 && digit < 10) {
				romanDigit += five;
				for (int i = 0; i < (digit - 5); i++) {
					romanDigit += one;
				}
				return romanDigit;
			}
			if (digit == 10)
				return romanDigit;
			else
				for (int i = 0; i < digit; i++) {
					romanDigit += "I";
				}
			return romanDigit;
		}
		return romanDigit;
	}

	public static String oneDigitConvert(int digit) {
		String romanDigit = "";

		if (digit == 4)
			return romanDigit + "IV";
		if (digit == 9)
			return romanDigit + "IX";
		if (digit == 5)
			return romanDigit + "V";
		if (digit > 5 && digit < 10) {
			romanDigit += "V";
			for (int i = 0; i < (digit - 5); i++) {
				romanDigit += "I";
			}
			return romanDigit;
		}
		if (digit >= 10)
			return romanDigit;
		else
			for (int i = 0; i < digit; i++) {
				romanDigit += "I";
			}

		return romanDigit;

		// if (digit == 1)
		// return romanDigit + "I";
		// if (digit == 2)
		// return romanDigit + "II";
		// if (digit == 3)
		// return romanDigit + "III";
		// if (digit == 4)
		// return romanDigit + "IV";
		// if (digit == 5)
		// return romanDigit + "V";
		// if (digit == 6)
		// return romanDigit + "VI";
		// if (digit == 7)
		// return romanDigit + "VII";
		// if (digit == 8)
		// return romanDigit + "VIII";
		// if (digit == 9)
		// return romanDigit + "IX";
		// else
		// return romanDigit;
	}

}
