## CountLettersDigits 
code:
  
package assignment;
import java.util.Scanner;
public class CountLettersDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("URK24CS6006 - PUJITHA");
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();
        int letters = 0, digits = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) letters++;
            else if (Character.isDigit(ch)) digits++;
        }
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
    }
}


##TextAnalysis
code:

package assignment;
import java.util.Scanner;
public class TextAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("URK24CS6006 - PUJITHA");
        System.out.println("Enter the paragraph (press Enter twice to stop):");
        StringBuilder sb = new StringBuilder();
        String line;
        while (!(line = sc.nextLine()).isEmpty()) {
            sb.append(line).append("\n");
        }
        String text = sb.toString();
        int spaces = text.length() - text.replace(" ", "").length();
        int words = text.trim().split("\\s+").length;
        int characters = text.replace("\n", "").length();
        int lines = text.split("\n").length;
        System.out.println("\n=== Result ===");
        System.out.println("Spaces: " + spaces);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + characters);
        System.out.println("Lines: " + lines);
    }
}

  
