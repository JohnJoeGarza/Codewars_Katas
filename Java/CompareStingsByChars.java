/*Compare two strings by comparing the sum of their values (ASCII character code).
*For comparing treat all letters as UpperCase.
*
*Null-Strings should be treated as if they are empty strings.
*If the string contains other characters than letters, treat the whole string as it would be empty.
*
*Examples:
*
*"AD","BC" -> equal
*
*"AD","DD" -> not equal
*
*"gf","FG" -> equal
*
*"zz1","" -> equal
*
*"ZzZz", "ffPFF" -> equal
*
*"kl", "lz" -> not equal
*
*null, "" -> equal
*
*Your method should return true, if the strings are equal and false if they are not equal.
*/

public class Kata {
	public static Boolean compare(String s1, String s2) {
		int sum1 = 0;
		int sum2 = 0;
		if (s1 != null && !s1.isEmpty()) {
			s1 = s1.toUpperCase();
			char[] charArray1 = s1.toCharArray();

			for (char theChar : charArray1) {
				if ((int) theChar < 'A' || (int) theChar > 'Z') {
					sum1 = 0;
					break;
				} else
					sum1 += (int) theChar;
			}
		}

		if (s2 != null && !s2.isEmpty()) {
			s2 = s2.toUpperCase();
			char[] charArray2 = s2.toCharArray();
			
			for (char theChar : charArray2) {
				if ((int) theChar < 'A' || (int) theChar > 'Z') {
					sum2 = 0;
					break;
				} else
					sum2 += (int) theChar;
			}
		}

		if (sum1 == sum2) {
			return true;
		} else
			return false;
	}
}
