package entities;

import entities.TaxPayer;

public class TaxPayerCompany extends TaxPayer {

    private int numberEmployees;

    public TaxPayerCompany(String name, Double annualIncome, int numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    @Override
    public Double tax() {
        if (numberEmployees>10){
            return 0.14 * annualIncome;
        }
        else{
            return 0.16 * annualIncome;
        }
    }
}
