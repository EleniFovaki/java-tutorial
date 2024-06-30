class Person {
    //Classes can contain:
    String name; //instance variables
    int age; //instance variables

    //Subroutines(methods)
    void speak(){

        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
    int calculateYearsToRetirement(){ //returns a value
        int yearsLeft = 65 - age;
        return yearsLeft;
    }
    String getName(){ //getters
        return name;
    }
    int getAge(){
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe Blogs";
        person1.age = 31;
        person1.speak();
        int years = person1.calculateYearsToRetirement();
        System.out.println("Years to retire: " + years);
        int age = person1.getAge();
        String name = person1.getName();

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 32;
        person2.speak();
        int age2 = person2.getAge();
        String name2 = person2.getName();
        System.out.println("Name is: " + name2);
        System.out.println("Age is: " + age2);
    }
}