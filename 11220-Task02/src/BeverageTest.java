import java.util.Scanner;

public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Do you want extras in your tea? (yes/no): ");
        String teaResponse = scanner.nextLine();
        tea.setWantsExtras(teaResponse.equalsIgnoreCase("yes"));

        System.out.println("Do you want extras in your coffee? (yes/no): ");
        String coffeeResponse = scanner.nextLine();
        coffee.setWantsExtras(coffeeResponse.equalsIgnoreCase("yes"));

        System.out.println("\nPreparing tea...");
        tea.finalTemplateMethod();

        System.out.println("\nPreparing coffee...");
        coffee.finalTemplateMethod();

        scanner.close();
    }
}
