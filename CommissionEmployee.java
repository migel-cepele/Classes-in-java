package chapter8_9;

public class CommissionEmployee extends Object{

    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;
    protected double grossSales;
    protected double commissionRate;

    //konstruktor qe merr 5 argumenta
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
    double grossSales, double commissionRate) {
        //thirrja implicite e konstruktorit default te Object ndodh ketu

        //checking for invalid args
        if(grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales duhen mbi 0.0");
        }

        if(commissionRate <=0.0 || commissionRate >=1.0)
        throw new IllegalArgumentException("duhet midis 0 dhe 1");

        this.commissionRate = commissionRate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grossSales = grossSales;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //get functions
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    //set functions
    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0)
        throw new IllegalArgumentException("gross sales mbi 0");

        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <=0.0 || commissionRate >=1.0)
        throw new IllegalArgumentException("duhet midis 0 dhe 1");

        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    //llogaritja e fitimeve
    public double earnings() {
        return commissionRate * grossSales;
    }

    //kthen paraqitjen string te commission employee object
    @Override //tregon qe kjo metod override nje metode te superklases
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
         "commission employee", firstName, lastName,
        "social security number", socialSecurityNumber, "gross sales", grossSales, 
        "commission rate", commissionRate);
    }
}