
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class RewardValue {
    @Test
    public void testCashToMilesConversion() {
        double cashAmount = 100.0;
        RewardValue rewardValue = new RewardValue(cashAmount);
        double expectedMiles = cashAmount / 0.0035; // Using the conversion rate from your class
        double actualMiles = rewardValue.getMilesValue();
        assertEquals(expectedMiles, actualMiles, 0.001); // Adjust delta as needed
    }

    @Test
    public void testMilesToCashConversion() {
        int miles = 500;
        RewardValue rewardValue = new RewardValue(miles);
        double expectedCash = miles * 0.0035; // Using the conversion rate from your class
        double actualCash = rewardValue.getCashValue();
        assertEquals(expectedCash, actualCash, 0.001); // Adjust delta as needed
    }
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
