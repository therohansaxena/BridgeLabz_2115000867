import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
    }
}
