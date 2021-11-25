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
    }
}
