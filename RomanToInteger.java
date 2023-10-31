import java.util.Scanner;

public class RomanToInteger {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a Roman numeral: ");
    String romanNumeral = scanner.nextLine();

    int integerValue = convertRomanNumeralToInteger(romanNumeral);

    System.out.println("The integer value of the Roman numeral " + romanNumeral + " is " + integerValue);
  }

  public static int convertRomanNumeralToInteger(String romanNumeral) {
    int integerValue = 0;

    for (int i = 0; i < romanNumeral.length(); i++) {
      char currentChar = romanNumeral.charAt(i);
      int currentValue = getCharacterValue(currentChar);

      // If the current character is greater than the next character, then subtract the next character from the current character.
      if (i < romanNumeral.length() - 1 && currentValue > getCharacterValue(romanNumeral.charAt(i + 1))) {
        integerValue -= currentValue;
      } else {
        integerValue += currentValue;
      }
    }

    return integerValue;
  }

  public static int getCharacterValue(char character) {
    switch (character) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        return -1;
    }
  }
}