package problem1;

public class State {
    private String stateName;
    private TaxBehavior taxBehavior;

    public State(String stateName) {
        this.stateName = stateName;
    }

    public void setTaxBehavior(TaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
    }

    public double applyTax(double saleAmount) {
        if (taxBehavior == null) {
            System.out.println("No tax behavior set. Defaulting to 0% tax.");
            return 0.0;
        }
        return taxBehavior.calculateTax(saleAmount);
    }

    public String getStateName() {
        return stateName;
    }
}
