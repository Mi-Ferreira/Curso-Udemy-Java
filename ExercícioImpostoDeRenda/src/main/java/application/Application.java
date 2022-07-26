package application;

import entities.TaxPayer;
import entities.TaxPayerCompany;
import entities.TaxPayerIndividual;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.println("Enter the number of tax payers:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + "data:");

            System.out.println("Individual or company (i/c)?");
            char type = sc.next().charAt(0);

            System.out.println("Name");
            String name = sc.next();

            System.out.println("Annual Income");
            Double annualIncome = sc.nextDouble();

            switch (type) {
                case 'i':
                    System.out.println("Health Expenditures");
                    Double healthExpenditures = sc.nextDouble();
                    TaxPayerIndividual taxPayerIndividual =
                            new TaxPayerIndividual(name,annualIncome,healthExpenditures);
                    taxPayerIndividual.tax();
                    taxPayers.add(taxPayerIndividual);
                    break;
                case 'c':
                    System.out.println("Number of Employees");
                    int numberEmployees = sc.nextInt();
                    TaxPayerCompany taxPayerCompany = new TaxPayerCompany
                            (name,annualIncome,numberEmployees);
                    taxPayerCompany.tax();
                    taxPayers.add(taxPayerCompany);
                    break;
            }
        }

        double totalTaxes = 0;
        System.out.println("Number of Employees");
        for (TaxPayer taxPayer : taxPayers){
            totalTaxes += taxPayer.tax();
            System.out.println(taxPayer.getName() + " $ " + String.format("%.2f",taxPayer.tax()));
        }
        System.out.print("TOTAL TAXES: " + String.format("%.2f",totalTaxes));
    }
}
