
public class Main {
    public static void main(String[] args) {
        String info = "";
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder";
        System.out.println(info);

        StringBuilder sb = new StringBuilder(""); //or do this instead, it is more efficient
        sb.append("My name is Sue");
        sb.append("");
        sb.append("I am a programmer");
        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder();
        sb2.append("My name is Roger")
                .append(" ")
                .append("I am a skydiver");

        System.out.println(sb2.toString());

        //Formatting
        System.out.println("here is some text.\tThat was a tab\nThat was a new line");
        System.out.printf("total cost %d", 5);

        for(int i=0; i<5; i++){
            System.out.printf("%2d: some text here\n", i);
        }

    }

}