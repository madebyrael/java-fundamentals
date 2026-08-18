public class TaxesNeverlands {
    public static void main(String[] args) {
        double salary = 45000;
        double firstBracket = 0.70 / 100;
        double secondBracket = 37.35 / 100;
        double thirdBracket = 40.50 / 100;
        double taxAmount;

        if (salary <= 34712) {
            taxAmount = salary * firstBracket;
        } else if (salary >= 34713 && salary <= 68507) {
            taxAmount = salary * secondBracket;
        } else {
            taxAmount = salary * thirdBracket;
        }
        System.out.println("The amount with you have to pay is "+ taxAmount);
    }
}
