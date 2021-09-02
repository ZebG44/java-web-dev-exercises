package exercises;
import java.util.Locale;
import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args) {
        String sentence1 = "Alice was beginning to get very tired of sitting by her sister on the bank, and \n" +
                "of having nothing to do: once or twice she had peeped into the book her sister \n" +
                "was reading, but it had no pictures or conversations in it, 'and what is the \n" +
                "use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println(sentence1);
        System.out.println("Enter a term to search for in the sentence above: ");
        Scanner term = new Scanner(System.in);
        String word = term.nextLine();

        System.out.println(sentence1.toLowerCase().contains(word));

        Integer index = sentence1.indexOf(word);
        Integer length = word.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = sentence1.replace(word, "@@@");
        System.out.println(modifiedSentence);
    }
}
