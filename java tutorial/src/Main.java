class Machine {
    private String name;
    private int age;

    public Machine() { //this is how you define a constructor
        System.out.println("A machine is running"); //so this runs automatically everytime an instance of a class is created
    }
    public Machine(String name, int age) { //or a constructor can act as a getter and a setter method combined
        this.name = name;
        this.age = age;
        System.out.println("the machine is called: " + name + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Machine c3po = new Machine("c3po", 5); //the output depends on the arguments of the constructor
    }

}