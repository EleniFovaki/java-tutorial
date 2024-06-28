class Person {
    //Classes can contain:
    String name; //instance variables
    int age; //instance variables

    //Subroutines(methods)
    void speak(){
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe Blogs";
        person1.age = 31;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 32;
        person2.speak();
    }
}