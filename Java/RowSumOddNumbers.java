/*Description:
*
*Given the triangle of consecutive odd numbers:
*
*             1
*          3     5
*       7     9    11
*   13    15    17    19
*21    23    25    27    29
*...
*Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:
*
*
*rowSumOddNumbers(1); // 1
*rowSumOddNumbers(2); // 3 + 5 = 8
*/


class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
    //Given Odd Number definition 2*a + 1 where a is an integer
    //the first element in the row n is given when a = startingOddIndex;
    int startingOddIndex = (n*(n-1))/2;
    int rowSum = 0;
    
    for(int i = 0; i < n; i++){
    rowSum += 2 * (startingOddIndex + i) + 1;
    }
    return rowSum;
  }
}
