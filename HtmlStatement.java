import java.util.Enumeration;

public class HtmlStatement extends Statement {

    private String getRentalRecordMessage(String customerName) {
        return "<H1>Rentals for <EM>" + customerName + "</EM></H1><P>\n";
    }

    private String getMovieTitleAndChargeMessage(String movieTitle, double charge) {
        return movieTitle + ": " + String.valueOf(charge) + "<BR>\n";
    }

    private String getAmountOwedMessage(double totalCharge) {
        return "<P>You owe <EM>" + String.valueOf(totalCharge) + "</EM><P>\n";
    }

    private String getEarnedRenterPointsMessage(int totalFrequentRenterPoints) {
        return "On this rental you earned <EM>" + String.valueOf(totalFrequentRenterPoints) + "</EM> frequent renter points<P>";
    }

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getRentalRecordMessage(aCustomer.getName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += getMovieTitleAndChargeMessage(each.getMovie().getTitle(), each.getCharge());
        }
        //add footer lines
        result += getAmountOwedMessage(aCustomer.getTotalCharge());
        result += getEarnedRenterPointsMessage(aCustomer.getTotalFrequentRenterPoints());
        return result;
    }
}
