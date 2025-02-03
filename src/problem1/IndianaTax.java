package problem1;

public class IndianaTax implements TaxBehavior {
    @Override
    public double calculateTax(double saleAmount) {
        return saleAmount * 0.07; // 7% tax
    }
}
