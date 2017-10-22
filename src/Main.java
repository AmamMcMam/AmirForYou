import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("done fam");
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter limit: ");
        float limit = scanner.nextFloat();
        System.out.print("\n enter number: ");
        String nu = scanner.next();

        Budget b = new Budget(limit,nu);

    }
}
