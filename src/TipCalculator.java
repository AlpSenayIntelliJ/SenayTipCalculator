import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args){

        // asking user for information
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("What was the total bill today? ");
        double totalBill = scan.nextDouble();
        System.out.print("What is the tip percentage? ");
        int tipPercent = scan.nextInt();
        System.out.print("How many people in your party this fine day? ");
        int numPeople = scan.nextInt();

        // calculating all information
        double tipDecimal = ((double) tipPercent/100); // taking the whole number percentage and turning it into a decimal for multiplication
        double totalTip = (totalBill*tipDecimal);
        double totalBillWithTip = (totalBill+totalTip);
        double tipPerPerson = (totalTip/numPeople);
        double totalPerPerson = (totalBillWithTip/numPeople);

        // printing results
        System.out.println();
        System.out.println("Total tip amount: " + (String.format("%.2f", totalTip)));
        System.out.println("Total bill including tip: " + (String.format("%.2f", totalBillWithTip)));
        System.out.println("Tip per person: " + (String.format("%.2f", tipPerPerson)));
        System.out.println("Total per person: " + (String.format("%.2f", totalPerPerson)));
    }
}
