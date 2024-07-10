class Frog{
    private String name;
    private int id; //variables should start with small letter, not capital

    public Frog(String name, int id){
        this.name = name;
        this.id= id;
    }
public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append(id).append("+").append(name);
     return sb.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Frog frog1 = new Frog("Bob", 5);
        System.out.println(frog1);
        }

    }