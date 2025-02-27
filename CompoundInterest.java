import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Value Of principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter The Value Of rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter The Value Of time: ");
        double t = sc.nextDouble();

        double amount = p * Math.pow(1 + r / 100, t);

        double compoundInterest = amount - p;

        System.out.println("Compound Interest Is: " + compoundInterest);

        sc.close();
    }
}
