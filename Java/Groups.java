/*Description:
*
*In English and programming, groups can be made using symbols such as "()" and "{}" that change meaning. However, these groups must be closed in the correct order to maintain correct syntax.
*
*Your job in this kata will be to make a program that checks a string for correct grouping. For instance, the following groups are done correctly:
*
*({})
*[[]()]
*[{()}]
*The next are done incorrectly
*
*{(})
*([]
*[])
*A correct string cannot close groups in the wrong order, open a group but fail to close it, or close a group before it is opened.
*
*Your function will take an input string that may contain any of the symbols "()" "{}" or "[]" to create groups.
*
*It should return True if the string is empty or otherwise grouped correctly, or False if it is grouped incorrectly.
*/

import java.util.ArrayList;
import java.util.List;

public class Groups {

	public static boolean groupCheck(String s) {

		if (s == null || s.isEmpty())
			return true;

		final int STRING_LENGTH = s.length();
		List<Character> a1 = new ArrayList<Character>();
    //First element added to ensure no out of bound index and used as a check to ensure all groups have been closed at the end.
		a1.add('0');

		for (int i = 0; i < STRING_LENGTH; i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				a1.add(s.charAt(i));
			}

			if (s.charAt(i) == ')' && a1.get(a1.size() - 1) != '(' || s.charAt(i) == '}' && a1.get(a1.size() - 1) != '{'
					|| s.charAt(i) == ']' && a1.get(a1.size() - 1) != '[') {
				return false;
			} else if (s.charAt(i) == ')' && a1.get(a1.size() - 1) == '('
					|| s.charAt(i) == '}' && a1.get(a1.size() - 1) == '{'
					|| s.charAt(i) == ']' && a1.get(a1.size() - 1) == '[') {
				a1.remove(a1.size() - 1);
			}
		}
		if (a1.size() == 1)
			return true;
		else
			return false;
	}
}
