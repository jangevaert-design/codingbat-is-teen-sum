package edu.cnm.deepdive;

/*

Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive,
are extra lucky. So if either value is a teen, just return 19.

teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
 */

public class CodingBatTeenSum {

  public static void main(String[] args) {

    System.out.printf("with the ints %s and %s, the sum will be " + teenSum(3, 4) + ".\n", 3, 4);
    System.out.printf("with the ints %s and %s, the sum will be " + teenSum(10, 13) + ".\n", 10, 13);
    System.out.printf("with the ints %s and %s, the sum will be " + teenSum(13, 2) + ".\n", 13, 2);

  }

  public static int teenSum(int a, int b) {
    if ((a > 12 && a < 20) || (b > 12 && b < 20)) {
      return 19;
    } else {
      return a + b;
    }
  }


}
