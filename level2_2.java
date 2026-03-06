import java.util.Scanner;

public class level2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary, bonus;
        int years;

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        years = sc.nextInt();

        if (years > 5) {
            bonus = salary * 0.05;
            System.out.println("Bonus amount = " + bonus);
        } else {
            System.out.println("No bonus because service is 5 years or less.");
        }

        sc.close();
    }
}