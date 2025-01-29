import java.util.Scanner;

public class SpringSeasonChecker {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        if (isSpringSeason(month, day))
            System.out.println("It's a Spring Season.");
        else
            System.out.println("Not a Spring Season.");
    }
}
