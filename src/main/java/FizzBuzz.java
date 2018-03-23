public class FizzBuzz {
  public static String returnAnswerForNumber(int numberToCheck) {
    checkArguments(numberToCheck);
    return computeAnswer(numberToCheck);
  }

  private static void checkArguments(int numberToCheck) {
    if (numberToCheck == 0) {
      throw new IllegalArgumentException();
    }
  }

  private static String computeAnswer(int numberToCheck) {
    String answer = String.valueOf(numberToCheck);
    if (isMultipleOfThree(numberToCheck)) {
      answer = "Fizz";
    }
    return answer;
  }

  private static boolean isMultipleOfThree(int numberToCheck) {
    return numberToCheck % 3 == 0;
  }
}
