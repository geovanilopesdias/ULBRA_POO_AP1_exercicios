import java.util.Scanner;

public class MultiplicationTable {
    private static int inputValue(){
        Scanner t = new Scanner(System.in);
        System.out.print("Insert a integer number: ");
        return t.nextInt();
    }

    public static void exhibitTable(){
        System.out.println("Multiplication Table Exhibitor:");
        int value = inputValue();
        System.out.println("The multiplication table of " + value + " is:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t" + i + " X " + value + " = " + i * value);

        }
    }
}
