package ie.atu;
import java.util.ArrayList;
import java.util.Scanner;

public class ArryList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        //Scanner scanner  = new Scanner(System.in);
        int x,input,uIn;

        for(x=0;x<9;x++){
            input = (x + 1) * 100;

            numbers.add(input);


        }

        for(int var : numbers){
            System.out.print("Element at index " + x + ": " + var + "\n");
        }
        System.out.println("The output from this program is\n");



        /*System.out.print("Please enter a value for index 9: ");
        uIn = scanner.nextInt();
        numbers.add(uIn);
        System.out.print("Element at index 9 : " + uIn + "\n");*/

    }
}
