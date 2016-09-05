package module4.homework;

public abstract class Bank {
//    You need to following structure: abstarct class Bank and three classes that extends it: USBank, EUBank, ChinaBank. Enum Currency. Class User that represents User of our Bank System. Interface BankSystem and its implementation BankSystemImpl.
//
//    Abstract class Bank should contain fields
//
//    long id
//    String bankCountry
//    Currency currency
//    int numberOfEmployees
//    double avrSalaryOfEmployee
//    long rating
//    long totalCapital
//
//    Generate getters and setters. And create constructor with all fields.
//
//    Methods are:
//
//    abstract int getLimitOfWithdrawal()
//    abstract int getLimitOfFunding()
//    abstract int getMonthlyRate()
//    abstract int getCommission(int summ)
//    double moneyPaidMonthlyForSalary()

    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    public abstract int getLimitOfWithdrawal();

    public abstract int getLimitOfFunding();

    public abstract double getMonthlyRate();

    public abstract double getCommission(int sum);

    public double moneyPaidMonthlyForSalary(){
        return this.numberOfEmployees*this.avrSalaryOfEmployee;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", bankCountry='" + bankCountry + '\'' +
                ", currency=" + currency +
                ", numberOfEmployees=" + numberOfEmployees +
                ", avrSalaryOfEmployee=" + avrSalaryOfEmployee +
                ", rating=" + rating +
                ", totalCapital=" + totalCapital +
                '}';
    }
}
