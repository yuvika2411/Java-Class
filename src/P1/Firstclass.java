package P1;


public class Firstclass {
    public static void main(String[] arr) {
        System.out.println("Hello World");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
//printstream sout is reference of printstream and println is of this class instead of system class

class Aa{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Firstclass.main(new String[]{"Hello","World"});
    }
}