import java.util.Enumeration;

public abstract class Statement {
    protected abstract String getRentalRecordMessage(String customerName);

    protected abstract String getMovieTitleAndChargeMessage(String movieTitle, double charge);

    protected abstract String getAmountOwedMessage(double totalCharge);

    protected abstract String getEarnedRenterPointsMessage(int totalFrequentRenterPoints);

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
