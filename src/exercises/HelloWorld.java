package exercises;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String name;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = input.nextLine();
        input.close();

        System.out.println("Hello, " + name);
    }
}
