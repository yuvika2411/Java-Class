package LAB1;
import java.util.Scanner;
// WAP to insert 3 numbers from the keyboard and find a greater number among 3 numbers.
public class Q1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1= input.nextInt();

        System.out.print("Enter Second Number: ");
        int num2= input.nextInt();

        System.out.print("Enter Third Number: ");
        int num3= input.nextInt();

        if(num1>num2 && num1>num3) {
            System.out.println("Greatest Number is : "+ num1);
        }
        else if(num2>num3 && num2>num1){
            System.out.println("Greatest Number is : "+ num2);
        }
        else{
            System.out.println("Greatest Number is : "+num3);
        }

    }
}
