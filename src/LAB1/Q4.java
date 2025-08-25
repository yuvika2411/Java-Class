package LAB1;
import java.util.Scanner;
import java.util.Arrays;
// WAP to count the number of characters in a given string, to reverse the string and check whether it is palindrome or not?

public class Q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter String: ");
        String str= sc.next();

        char[] strarray = str.toCharArray();

        int count=0;
        for(int i=0;i< strarray.length;i++){
            count++;
        }

        System.out.println("Number of characters in a given string are : "+count);

        int n= strarray.length;


        int i=0;
        int j=n-1;
        while(i<j){
            char ch = strarray[i];
            strarray[i] = strarray[j];
            strarray[j] = ch;
            i++;
            j--;
        }

        System.out.println(strarray);


    }
}
