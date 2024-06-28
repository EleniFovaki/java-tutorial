import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = 7;
        int[] values;

        values = new int[3]; //new keyword allocates the memory

        System.out.println(values[0]); //prints 0 if the value is not defined in this position
        for(int i =0; i<values.length; i++){ //iterates through the array
            System.out.println(values[i]);
        }
        int[] numbers ={5,6,7};
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}