package P1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("New Main");
        Scanner input = new Scanner(new File("src/P1/aa.txt"));
        System.out.printf("%s", "Enter input\n");
        String data = input.nextLine();
        System.out.println(data);
    }
}


