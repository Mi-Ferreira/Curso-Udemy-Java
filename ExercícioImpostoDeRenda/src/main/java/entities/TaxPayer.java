package entities;

public abstract class TaxPayer {

    private String name;
    protected Double annualIncome;

    public TaxPayer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public abstract Double tax();

}
