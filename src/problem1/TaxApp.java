package problem1;

public class TaxApp {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java problem1.TaxApp <StateName> <SaleAmount>");
            return;
        }

        String stateName = args[0];
        double saleAmount = Double.parseDouble(args[1]);

        // Create the State
        State currentState = new State(stateName);

        // Correctly assign TaxBehavior
        TaxBehavior taxBehavior;
        switch (stateName.toLowerCase()) {
            case "hawaii":
                taxBehavior = new HawaiiTax();
                break;
            case "indiana":
                taxBehavior = new IndianaTax();
                break;
            case "alaska":
                taxBehavior = new AlaskaTax();
                break;
            default:
                System.out.println("Unrecognized state: defaulting to 0% tax.");
                taxBehavior = new AlaskaTax();
                break;
        }

        // Set the tax behavior correctly
        currentState.setTaxBehavior(taxBehavior);

        double tax = currentState.applyTax(saleAmount);
        double total = saleAmount + tax;

        System.out.printf("Sale Amount: %.2f\nTax: %.2f\nTotal: %.2f\n", saleAmount, tax, total);
    }
}
