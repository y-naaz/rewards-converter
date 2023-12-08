public class RewardValue {
    private double cashValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return convertCashToMiles(cashValue);
    }

    // Conversion rate from miles to cash
    private double convertMilesToCash(int milesValue) {
        return milesValue * 0.0035;
    }

    // Conversion rate from cash to miles
    private double convertCashToMiles(double cashValue) {
        return cashValue / 0.0035;
    }
}
