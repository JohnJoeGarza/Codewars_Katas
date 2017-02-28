/*Description:
*
*You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string in the first array and y be any string in the second array.
*
*Find max(abs(length(x) − length(y)))
*
*If a1 or a2 are empty return -1 in each language except in Haskell where you will return Nothing.
*
*Example:
*
*s1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
*s2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
*mxdiflg(s1, s2) --> 13
*/


class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
		  final int a1_LENGTH = a1.length;
		  final int a2_LENGTH = a2.length;

	  	if (a1.length == 0 || a2.length == 0) {
		  	return -1;
	   	}
		
		  int a2Min = a2[0].length();
		  int a2Max = a2[0].length();
		  int a1Min = a1[0].length();
		  int a1Max = a1[0].length();

		  if (a1_LENGTH > 1) {
			  for (int i = 1; i < a1_LENGTH; i++) {
			  	if (a1[i].length() > a1Max) {
				  	a1Max = a1[i].length();
				  } else if (a1[i].length() < a1Min)
					  a1Min = a1[i].length();
			  }
	  	}
		
		  if (a2_LENGTH > 1) {
			  for (int i = 1; i < a2_LENGTH; i++) {
			  	if (a2[i].length() > a2Max) {
				  	a2Max = a2[i].length();
				  } else if (a2[i].length() < a2Min)
					  a2Min = a2[i].length();
			  }
	  	}
		return a1Max - a2Min > a2Max - a1Min ? (a1Max - a2Min) : (a2Max - a1Min) ;
    }
}
