package countingcharacters;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.io.File;
import java.util.Scanner;
public class CountingCharactersStudio {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\cabinets.txt");
        Scanner sc = new Scanner(file);

        String quote = sc.nextLine();

        HashMap<Character, Integer> quoteCharacterCount = new HashMap<>();

        quote = quote.replaceAll("[^a-zA-Z0-9]","");

        for(int i = 0; i < quote.length(); i++) {
            if(!quoteCharacterCount.containsKey(quote.charAt(i))) {
                quoteCharacterCount.put(quote.charAt(i), 1);
            } else {
                quoteCharacterCount.put(quote.charAt(i), quoteCharacterCount.get(quote.charAt(i)) + 1);
            }
        }

        for(Character letter : quoteCharacterCount.keySet()) {
            System.out.println(letter + " - " + quoteCharacterCount.get(letter));
        }
    }
}
