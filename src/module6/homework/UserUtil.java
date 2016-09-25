package module6.homework;

public class UserUtil {

    public static final User[] splitNull(User[] array) {
        User[] result;
        int counter = 0;
        for (User item : array) {
            if (item != null) counter++;
        }
        result = new User[counter];
        counter = 0;
        for (User item : array) {
            if (item != null) {
                result[counter] = item;
                counter++;
            }
        }
        return result;
    }

    public static void printUserArray(User[] array) {
        for (User item : array) {
            System.out.println(item);
        }
    }

    public static User[] uniqueUsers(User[] users) {
        int counter = 0;
        User[] result = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                boolean flag = true;
                for (int j = 0; j < users.length; j++) {
                    if (users[i].equals(users[j]) && i != j) {
                        flag = false;
                        break;
                    }
                }
                if (flag) result[counter] = users[i];
                counter++;
            }
        }
        return splitNull(result);
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        int counter = 0;
        User[] result = new User[users.length];
        for (User item : users) {
            if (item != null) {
                if (item.getBalance() == balance) {
                    result[counter] = item;
                    counter++;
                }
            }
        }
        return splitNull(result);
    }

    public static final User[] paySalaryToUsers(User[] users) {
        for (User item : users) {
            if (item != null) {
                item.setBalance(item.getBalance() + item.getSalary());
            }
        }
        return splitNull(users);
    }

    public static final long[] getUsersId(User[] users) {
        long[] result = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                result[i] = users[i].getId();
            }
        }
        return result;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        return splitNull(users);
    }

}
