package src;

public class RomanApp {

	public static String numberConvert(int number) {
		if (number / 10 == 0)
			return oneDigitConvert(number);
		if (number / 10 == 1)
			return "X" + oneDigitConvert(number % 10, number / 10);
		if (number / 10 == 2)
			return "XX" + oneDigitConvert(number % 10, number / 10);
		if (number / 10 == 3)
			return "XXX" + oneDigitConvert(number % 10, number / 10);
		if (number / 10 == 4)
			return "XL" + oneDigitConvert(number % 10, number / 10);
		if (number / 10 == 5)
			return "L" + oneDigitConvert(number % 10, number / 10);
		if (number / 10 == 6)
			return "LX" + oneDigitConvert(number % 10, number / 10);
		if (number / 10 == 7)
			return "LXX" + oneDigitConvert(number % 10, number / 10);
		if (number / 10 == 8)
			return "LXXX" + oneDigitConvert(number % 10, number / 10);
		if (number / 10 == 9)
			return "XC" + oneDigitConvert(number % 10, number / 10);
		else
			return "";
	}

	public static String oneDigitConvert(int digit, int decimal) {
		String romanDigit = "";
		
		if (decimal < 10) {
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
