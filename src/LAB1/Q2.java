package LAB1;


// WAP to count the total number of odd numbers between 1-100, and display the sum of them.

public class Q2 {
    public static void main(String[] args) {

        int count=0;
        int sum=0;
        for(int i=0;i<=100;i++){
            if(i%2 !=0){
                count++;
                sum = sum+i;
            }
        }

        System.out.println("Total number of odd numbers is : "+ count);
        System.out.println("Sum of all odd numbers is "+ sum);


    }
}
