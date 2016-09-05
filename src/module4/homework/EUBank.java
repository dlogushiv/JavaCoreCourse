package module4.homework;


public class EUBank extends Bank{

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 2000;
        } else {
            return 2200;
        }
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 20000;
        } else {
            return 10000;
        }
    }

    @Override
    public double getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 0;
        } else {
            return 0.01;
        }
    }

    @Override
    public double getCommission(int sum) {
        if (getCurrency() == Currency.USD) {
            return (sum <= 1000 ? sum * 0.05 : sum * 0.07);
        } else {
            return (sum <= 1000 ? sum * 0.02 : sum * 0.04);
        }
    }

}
