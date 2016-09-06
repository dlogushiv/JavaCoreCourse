package module4.homework;


public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (user.getBank().getLimitOfWithdrawal() >= amount) {
            user.setBalance(user.getBalance() - amount - user.getBank().getCommission(amount));
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        if (user.getBank().getLimitOfFunding() >= amount) {
            user.setBalance(user.getBalance() + amount);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        fromUser.setBalance(fromUser.getBalance() - amount - fromUser.getBank().getCommission(amount));
        toUser.setBalance(toUser.getBalance() + amount);
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }
}
