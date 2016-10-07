package usefulUtils;

import java.util.Random;

public class StringRandom {
    public static String generateString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        Random random = new Random();
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }
        return new String(text);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1) + ": " + generateString(15));
        }
    }
}
