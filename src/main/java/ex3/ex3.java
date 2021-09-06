/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = scanner.nextLine();

        System.out.print("Who said it? ");
        String author = scanner.nextLine();
        System.out.println(author + " says, \"" + quote + "\"");

    }
}