package module4.homework;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 100;
        } else {
            return 150;
        }
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) {
            return 10000;
        } else {
            return 5000;
        }
    }

    @Override
    public double getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 0.01;
        } else {
            return 0;
        }
    }

    @Override
    public double getCommission(int sum) {
        if (getCurrency() == Currency.USD) {
            return (sum <= 1000 ? sum * 0.03 : sum * 0.05);
        } else {
            return (sum <= 1000 ? sum * 0.1 : sum * 0.11);
        }
    }
}
