package Test;
import java.util.Scanner;
import java.util.InputMismatchException;

interface Book{
    void bookRide();
    void cancelRide();
}

interface keys {
    int Id = 0;
    int Price = 0;
}

abstract class Cab implements Book, keys {

    int Id;
    int Price;
    public void bookRide() {
        System.out.println("Cab ID: " + Id + " is scheduled for " + Price + " rupees at 10:00AM");
    }
    public void cancelRide() {
        int newPrice = Price - 200;
        System.out.println("Cab ID: " + Id + " ride is canceled. Refund is " + newPrice + " rupees.");
    }

}
abstract class Train implements Book, keys {

    int Id;
    int Price;
    public void bookRide() {
        System.out.println("Train ID: " + Id + " is scheduled for " + Price + " rupees");
    }
    public void cancelRide() {
        int newPrice = Price - 200;
        System.out.println("Train ID: " + Id + " ride is canceled. Refund is " + newPrice + " rupees.");
    }

}
abstract class Bus implements Book, keys {

    int Id;
    int Price;
    public void bookRide() {
        System.out.println("Bus ID: " + Id + " is scheduled for " + Price + " rupees");
    }
    public void cancelRide() {
        int newPrice = Price - 200;
        System.out.println("Bus ID: " + Id + " is canceled. No refund");
    }

}

public class QuickRide{
    public static void main(String[] args) {

        Cab cab= new Cab(){
            {
                Id = 101;
                Price = 500;
            }
        };

        Train train = new Train(){
            {
                Id= 202;
                Price=1200;
            }
        };

        Bus bus= new Bus(){
            {
                Id= 303;
                Price=200;
            }
        };


        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option:");
        System.out.println("1. Book a Cab");
        System.out.println("2. Cancel a Cab");
        System.out.println("3. Book a Train");
        System.out.println("4. Cancel a Train");
        System.out.println("5. Book a Bus");
        System.out.println("6: Cancel a Bus");

                try {
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            cab.bookRide();
                            break;
                        case 2:
                            cab.cancelRide();
                            break;
                        case 3:
                            train.bookRide();
                            break;
                        case 4:
                            train.cancelRide();
                            break;
                        case 5:
                            bus.bookRide();
                            break;
                        case 6:
                            bus.cancelRide();
                            break;
                        default:
                            System.out.println("Invalid option. Please choose a number from 1 to 5.");
                    }
                }
                catch (Exception e) {
                    System.out.println("An unexpected error occurred: " + e);
                }
                finally {
                    System.out.println("Execution finished.");
                }
            }
        }



