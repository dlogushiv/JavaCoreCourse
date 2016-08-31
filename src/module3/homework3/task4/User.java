package module3.homework3.task4;

//        + Create User class with the following fields: String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency.
//        + Create getters and setters and constructor with all fields.
//        Write methods:
//            void paySalary() -  that add salary to the balance of the user
//            withdraw(int summ) - takes money from the balance with 5% commision if summ < 1000 and 10% commision in other cases
//            companyNameLength - calculates length of the company name
//            monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private String currency;
    private int salary;


    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
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

    public void paySalary(User name, int salary){
        int balance = this.getBalance();
        this.setBalance(balance+=salary);
    }
}
