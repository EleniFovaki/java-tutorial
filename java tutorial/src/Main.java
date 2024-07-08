class Thing {
    public final static int LUCKY_NUMBER = 5;
    public String name;
    public static String description;

    public void showName(){
        System.out.println(description + ": " + name);
    }
    public static void showInfo(){
        System.out.println(description);
    }
}

public class Main {
    public static void main(String[] args) {
        Thing.description = "I am a thing";
        Thing.showInfo();

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Bob";
        thing2.name = "Sue";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);
    }

}