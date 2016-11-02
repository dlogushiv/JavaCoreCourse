package module10.homework;

import module7.homework.User;

public class Task10_3 {
    public static void main(String[] args) {
        User user = null;

//        System.out.println(user.getCity());

        try {
            user.getCity();
        }catch (NullPointerException e){
            System.out.println("Attention! An user is null!");
        }
    }
}
