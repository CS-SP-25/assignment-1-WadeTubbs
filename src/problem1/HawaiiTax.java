package problem1;

public class HawaiiTax implements TaxBehavior {
    @Override
    public double calculateTax(double saleAmount) {
        return saleAmount * 0.045; // 4.5% tax
    }
}
