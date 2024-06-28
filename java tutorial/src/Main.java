import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[3];

        words[0]="Hello";
        words[1]="to";
        words[2]="you";

        System.out.println(words[2]);

        String[] fruits = {"apple", "cherries", "melons"};
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        int value = 0; //default initialization for ints
        String text = null; //default initialization for strings
    }
}