class Person {
    String name; //instance variables
    int age; //instance variables
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe Blogs";
        person1.age = 31;

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 32;

        System.out.println(person1.name);
    }
}