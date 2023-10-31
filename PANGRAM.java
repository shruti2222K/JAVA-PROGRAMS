import java.util.Scanner;
public class PANGRAM {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String sentence = scanner.nextLine();
    boolean isPangram = true;
    for (char c = 'a'; c <= 'z'; c++) {
      if (!sentence.contains(String.valueOf(c))) {
        isPangram = false;
        break;
      }
    }
    if (isPangram) {
      System.out.println("The sentence is a pangram.");
    } else {
      System.out.println("The sentence is not a pangram.");
    }
  }
}