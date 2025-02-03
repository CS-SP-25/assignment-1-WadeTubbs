package problem1;

public class AlaskaTax implements TaxBehavior {
    @Override
    public double calculateTax(double saleAmount) {
        return 0.0; // No tax
    }
}
