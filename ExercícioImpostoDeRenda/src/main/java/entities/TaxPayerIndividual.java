package entities;

import entities.TaxPayer;

public class TaxPayerIndividual extends TaxPayer {

    private Double healthExpenditures;

    public TaxPayerIndividual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (annualIncome < 20000) {
            if (healthExpenditures>0){
                return (annualIncome * 0.15) - (0.50 *healthExpenditures);
            }
            else{
                return annualIncome * 0.15;
            }
        } else {
            if (healthExpenditures>0){
                return (annualIncome * 0.25) - (0.50 *healthExpenditures);
            }
            else{
                return annualIncome * 0.25;
            }
        }
    }

}
