/* Hans de los Santos
Tip Calculator Project
Periods 5-6 APCSA with Mr. Miller */

// import packages
import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
        // assign usable variables to packages
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        // welcome the user, line 1 of output
        System.out.println("Welcome to the tip calculator!");

        // store the number of people at the table, line 2 of output
        System.out.print("How many people are in your group? ");
        int people = scan.nextInt();
        scan.nextLine();

        // store the tip percentage, line 3 of output
        System.out.print("What's the tip percentage? (0 - 100): ");
        int tipPercent = scan.nextInt();

        // store the bill before tip as the sum of all items inputted, "line 4" of output
        double billBeforeTip = 0;
        double itemCost = 0;
        while (itemCost != -1) {
            billBeforeTip += itemCost;
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            itemCost = scan.nextDouble();
            scan.nextLine();
        }

        // simple printing out values, lines 5-7 of output
        System.out.println("---------------------------");
        System.out.println("Total Bill Before Tip: " + billBeforeTip);
        System.out.println("Tip Percentage: " + tipPercent);

        // round and print tip before adding to bill, while storing it for later, line 8 of output
        double tipAmount = billBeforeTip * ((double) tipPercent/100);
        String printedTipAmount = formatter.format(tipAmount);
        System.out.println("Total Tip: " + printedTipAmount);

        // round and print bill after tip, while storing it for later, line 9 of output
        double totalBill = tipAmount + billBeforeTip;
        String printedTotalBill = formatter.format(totalBill);
        System.out.println("Total Bill With Tip: " + printedTotalBill);

        // calculate, round and print all per person values, lines 10-12 of output
        System.out.println("Per Person Cost Before Tip: " + formatter.format(billBeforeTip/people));
        System.out.println("Tip Per Person: " + formatter.format(tipAmount/people));
        System.out.println("Total Cost Per Person: " + formatter.format(totalBill/people));
    }
}
