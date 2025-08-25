package LAB1;
import java.util.Scanner;
// WAP to Find largest and smallest numbers in an array.

public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n= sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Elements of array is: ");

        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        int max= arr[0];
        int min= arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max= arr[i];
            }
            else if (min>arr[i]){
                min= arr[i];
            }
        }

        System.out.println("Greatest Number of array is: "+ max);
        System.out.println("Smallest Number of array is: "+min);
    }
}
