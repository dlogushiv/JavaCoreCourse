package module4.homework;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 1000;
        } else {
            return 1200;
        }
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 10000;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    @Override
    public double getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 0.01;
        } else {
            return 0.015;
        }
    }

    @Override
    public double getCommission(int sum) {
        if (getCurrency() == Currency.USD) {
            return (sum <= 1000 ? sum * 0.05 : sum * 0.07);
        } else {
            return (sum <= 1000 ? sum * 0.06 : sum * 0.08);
        }
    }

}
