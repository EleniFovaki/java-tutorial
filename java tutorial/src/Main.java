public class Main {
    public static void main(String[] args) {

        String text = "Hello world!"; // non primitive data type, is a class
        String blank = "";
        String name = "Bob";
        String greeting = text + blank + name;
        System.out.println(greeting);
        System.out.println("Hello" + " " + "Bob");
        double myDouble = 7.8;
        System.out.println("My number is " +myDouble);
    }
}