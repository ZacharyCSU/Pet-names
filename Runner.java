import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(new Pet());
        System.out.println(new Pet("Buster", "Dog", 11));

        System.out.println("\nEnter animal type:");
        String type = scanner.nextLine();
        System.out.println("Enter animal name:");
        String name = scanner.nextLine();
        System.out.println("Enter animal age:");
        int age = scanner.nextInt();

        System.out.println(new Pet(name, type, age));
        scanner.close();
    }
}