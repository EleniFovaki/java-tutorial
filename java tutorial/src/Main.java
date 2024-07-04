class Robot{
    public void speak(String text){
        System.out.println(text);
    }
    public void jump(int height){
        System.out.println("Jumping: " + height);
    }
    public void move(String direction, double distance){
        System.out.println("Moving: " + distance + "in direction" + direction);
    }
}

public class Main {
    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak("Hi I am Sam");
        sam.jump(500);
        sam.move("west", 12.2);
        String greeting = "Hello there";
        sam.speak(greeting);
    }
}