import java.util.Enumeration;

public class TextStatement extends Statement {

    protected String getRentalRecordMessage(String customerName) {
        return "Rental Record for " + customerName + "\n";
    }

    protected String getMovieTitleAndChargeMessage(String movieTitle, double charge) {
        return "\t" + movieTitle + "\t" + String.valueOf(charge) + "\n";
    }

    protected String getAmountOwedMessage(double totalCharge) {
        return "Amount owed is " + String.valueOf(totalCharge) + "\n";
    }

    protected String getEarnedRenterPointsMessage(int totalFrequentRenterPoints) {
        return "You earned " + String.valueOf(totalFrequentRenterPoints) + " frequent renter points";
    }
}
