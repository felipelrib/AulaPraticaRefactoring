import java.util.Enumeration;

public class HtmlStatement extends Statement {

    protected String getRentalRecordMessage(String customerName) {
        return "<H1>Rentals for <EM>" + customerName + "</EM></H1><P>\n";
    }

    protected String getMovieTitleAndChargeMessage(String movieTitle, double charge) {
        return movieTitle + ": " + String.valueOf(charge) + "<BR>\n";
    }

    protected String getAmountOwedMessage(double totalCharge) {
        return "<P>You owe <EM>" + String.valueOf(totalCharge) + "</EM><P>\n";
    }

    protected String getEarnedRenterPointsMessage(int totalFrequentRenterPoints) {
        return "On this rental you earned <EM>" + String.valueOf(totalFrequentRenterPoints) + "</EM> frequent renter points<P>";
    }
}
