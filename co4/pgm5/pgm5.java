package co4;
import java.util.Scanner;
public class pgm5{
    public static void main(String[] args) {
        System.out.println("Enter The number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        mul obj1 = new mul();
        obj1.start();
        prime obj2 = new prime(number);
        obj2.start();
    }
}