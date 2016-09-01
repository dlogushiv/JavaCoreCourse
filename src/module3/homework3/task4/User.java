package module3.homework3.task4;

//        + Create User class with the following fields: String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency.
//        + Create getters and setters and constructor with all fields.
//        Write methods:
//            + void paySalary() -  that add salary to the balance of the user
//            + withdraw(int summ) - takes money from the balance with 5% commision if summ < 1000 and 10% commision in other cases
//            + companyNameLength - calculates length of the company name
//            + monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth

public class User {
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private String currency;
    private int salary;

    public User(String name, double balance, int monthsOfEmployment, String companyName, String currency, int salary) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.currency = currency;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void paySalary() {
        double balance = getBalance();
        setBalance(balance += salary);
    }

    public double withdraw(int summ) {
        double commission = 0;
        double withdrawPlusCommission = 0;
        if (summ < 1000) {
            commission = 0.05;
        } else {
            commission = 0.1;
        }
        withdrawPlusCommission = summ + summ * commission;
        if (getBalance() < withdrawPlusCommission) {
            return -1;
        } else {
            setBalance(getBalance() - withdrawPlusCommission);
            return getBalance() - withdrawPlusCommission;
        }
    }

    public int companyNameLength(User name) {
        return name.getCompanyName().length();
    }

    public void monthIncreaser(int addMonth) {
        setMonthsOfEmployment(getMonthsOfEmployment() + addMonth);
    }
}

