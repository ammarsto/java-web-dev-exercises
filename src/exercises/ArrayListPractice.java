package exercises;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(45);
        numberList.add(34);
        numberList.add(87);
        numberList.add(66);
        numberList.add(19);
        numberList.add(7);
        numberList.add(61);
        numberList.add(91);
        numberList.add(15);
        numberList.add(82);

        System.out.println(sumOfEvens(numberList));

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("chair");
        wordList.add("chaise");
        wordList.add("armchair");
        wordList.add("stool");
        wordList.add("bench");
        wordList.add("recliner");

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter number to search for words of equal length: ");
        int searchNumber = input.nextInt();

        fiveLetterWords(wordList, searchNumber);
    }

    public static int sumOfEvens(ArrayList<Integer> arr) {
        int sum = 0;
        for (int integer : arr) {
            if(integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;
    }

    public static void fiveLetterWords(ArrayList<String> arr, int searchNumber) {
        for (String word : arr) {
            if(word.length() == searchNumber) {
                System.out.println(word);
            }
        }
    }
}
