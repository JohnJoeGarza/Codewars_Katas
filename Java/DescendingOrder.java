
/*Description:
*
*Your task is to make a function that can take any non-negative integer as a argument and return it with it's digits in descending order. Essentially, rearrange the digits to create the highest possible number.
*
*Examples:
*
*Input: 21445 Output: 54421
*
*Input: 145263 Output: 654321
*
*Input: 1254859723 Output: 9875543221
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DescendingOrder {
  public static int sortDesc(final int num) {
    int alteredNum = num;
    int pwer = 0;
    List<Integer> numList = new ArrayList();
    StringBuilder sortedNum = new StringBuilder();
    
    if(alteredNum == 0){
      return 0;
    }
    
    while(alteredNum > 0){
      numList.add(alteredNum % 10);
      alteredNum = alteredNum/10;
    }
    Collections.sort(numList);
    Collections.reverse(numList);
    
    for(int number : numList){
      sortedNum.append(number);
    }
    return Integer.parseInt(sortedNum.toString());
  }
  
}
