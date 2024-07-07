class Frog{
    private String name;
    private int age;
    public void setName(String name){ //setters method declaration
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Frog frog1 = new Frog();
        frog1.setName("Bertie");

        System.out.println(frog1.getName());
    }

}