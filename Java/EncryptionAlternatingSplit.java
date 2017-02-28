/*Description:
*
*For building the encrypted string:
*Take every 2nd char from the string, then the other chars, that are not every 2nd char, and concat them as new String.
*Do this n times!
*
*Examples:
*
*"This is a test!", 1 -> "hsi  etTi sats!"
*"This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
*Write two methods:
*
*String encrypt(final String text, final int n)
*String decrypt(final String encryptedText, final int n)
*For both methods:
*If the input-string is null or empty return exactly this value!
*If n is <= 0 then return the input text.
*/

public class Kata {

	public static String encrypt(final String text, final int n) {
		if (text == null || text.isEmpty()) {
			return text == null ? null : "";
		}

		if (n <= 0) {
			return text;
		}
		int num = 0;
		int index = 0;
		final int TEXT_LENGTH = text.length();
		String toEncrypt = text;
		char[] encrypted = new char[TEXT_LENGTH];

		while (num < n) {
			for (int i = 1; i < TEXT_LENGTH; i = i + 2) {
				encrypted[index] = toEncrypt.charAt(i);
				index++;
			}
			for (int i = 0; i < TEXT_LENGTH; i = i + 2) {
				encrypted[index] = toEncrypt.charAt(i);
				index++;
			}
			index = 0;
			toEncrypt = String.valueOf(encrypted);
			num++;
		}
		
		return toEncrypt;
	}

	public static String decrypt(final String encryptedText, final int n) {
		if (encryptedText == null || encryptedText.isEmpty()) {
			return encryptedText == null ? null : "";
		}
		if (n <= 0) {
			return encryptedText;
		}
		
		int num = 0;
		int index = 0;
		final int TEXT_LENGTH = encryptedText.length();
		String toDecrypt = encryptedText;
		char[] decrypted = new char[TEXT_LENGTH];

		while (num < n) {
			for (int i = 1; i < TEXT_LENGTH; i = i + 2) {
				decrypted[i] = toDecrypt.charAt(index);
				index++;
			}
			for (int i = 0; i < TEXT_LENGTH; i = i + 2) {
				decrypted[i] = toDecrypt.charAt(index);
				index++;
			}
			index = 0;
			toDecrypt = String.valueOf(decrypted);
			num++;
		}
		return toDecrypt;
	}
}
