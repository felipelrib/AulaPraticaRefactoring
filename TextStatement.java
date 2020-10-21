import java.util.Enumeration;

public class TextStatement extends Statement {

    private String getRentalRecordMessage(String customerName) {
        return "Rental Record for " + customerName + "\n";
    }

    private String getMovieTitleAndChargeMessage(String movieTitle, double charge) {
        return "\t" + movieTitle + "\t" + String.valueOf(charge) + "\n";
    }

    private String getAmountOwedMessage(double totalCharge) {
        return "Amount owed is " + String.valueOf(totalCharge) + "\n";
    }

    private String getEarnedRenterPointsMessage(int totalFrequentRenterPoints) {
        return "You earned " + String.valueOf(totalFrequentRenterPoints) + " frequent renter points";
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
