package ie.atu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int[] numbers;
        int x,input,uIn;

        numbers = new int[10];

        System.out.println("The output from this program is\n");

        for(x=0;x<9;x++){
            input = (x + 1) * 100;
            numbers[x] = input;
            System.out.print("Element at index " + x + ": " + input + "\n");
        }

        System.out.print("Please enter a value for index 9: ");
        uIn = scanner.nextInt();
        numbers[9] = uIn;
        System.out.print("Element at index 10 : " + uIn + "\n");



    }
}