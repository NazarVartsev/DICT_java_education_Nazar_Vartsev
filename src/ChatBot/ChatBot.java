package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String bot_name = "Sad-bot";
        int birth_year = 2021;

        // Приветствие
        System.out.println("Hello! My name is " + bot_name
                + "\nI was created in " + birth_year);
        System.out.println("Please, remind me your name.");
        String user_name = s.nextLine();
        System.out.println("What a great name you have, " + user_name + '!');

        // Ввод 3, 5, 7
        System.out.println("""
                Let me guess your age.
                Enter remainders of dividing your age by 3, 5 and 7.""");
        byte remainder3 = s.nextByte();
        byte remainder5 = s.nextByte();
        byte remainder7 = s.nextByte();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        // Счет
        System.out.println("Now I will prove you that I can count to any number you want.");
        int number_check = s.nextInt();
        for (int i = 0; i <= number_check; i++) {
            System.out.println(i + " !");
        }
    }
}
