package LAB1;

public class Q5 {
        public static void main(String[] args) {
            int sum = 0;
            // Loop through command line arguments
            for (String arg : args) {
                sum += Integer.parseInt(arg); // convert String to int and add
            }
            // Print result
            System.out.println("Sum = " + sum);

    }

}
