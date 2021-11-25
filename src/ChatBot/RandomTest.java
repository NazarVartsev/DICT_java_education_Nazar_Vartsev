package ChatBot;

import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class RandomTest {
    private final Map<Integer, String> test_text = Map.of(
            1, "Если переменная имеет доступ private, то можно ли ее использовать"
                    + "в другом классе на прямую?",
            2, "В чем принципиальное отличие ООП от процедурного программирования?",
            3, "String - это класс?",
            4, "Можно ли запустить программу, которая выведет \"Hello World\", без main?"
    );
    private final Map<Integer, String> test_answers = Map.of(
            1, "Нет, нельзя.",
            2, "То что весь код в функциональном программировании построен на создании функций, \n"
                    + "а ООП это создание объектов и классов, которые представляют из себя структуру данных.",
            3, "Да, это класс.",
            4, "Да можно, но при условии, если метод будет static, и написать \"System.exit(0)\"."
    );
    private final Map<Integer, String> test_answers_1 = Map.of(
            1, "Да можно.",
            2, "Нет, нельзя.",
            3, "Если создать объект, то можно."
    );
    private final Map<Integer, String> test_answers_2 = Map.of(
            1, "То что ООП быстрее, чем функ. программирование.",
            2, "То что к языку функ. программирования нельзя подключить базу данных",
            3, "То что весь код в функциональном программировании построен на создании функций, \n"
                    + "а ООП это создание объектов и классов, которые представляют из себя структуру данных."
    );
    private final Map<Integer, String> test_answers_3 = Map.of(
            1, "Да, это класс.",
            2, "Нет, это только тип данных.",
            3, "Нет, это строка."
    );
    private final Map<Integer, String> test_answers_4 = Map.of(
            1, "Да можно, но при условии, если метод будет static, и написать \"System.exit(0)\".",
            2, "Нет, потому что все программы в Java начинаются с "
                    + "\"public static void main(String[] args)\"",
            3, "Нет, потому что это приведет к ошибке."
    );

    private String testPrint(String task) {
        String a;
        String b;
        String c;

        if (Objects.equals(task, "test_answers_1")) {
            a = test_answers_1.get(1);
            b = test_answers_1.get(2);
            c = test_answers_1.get(3);
            return connectionAnswers(a, b, c);

        } else if (Objects.equals(task, "test_answers_2")) {
            a = test_answers_2.get(1);
            b = test_answers_2.get(2);
            c = test_answers_2.get(3);
            return connectionAnswers(a, b, c);

        } else if (Objects.equals(task, "test_answers_3")) {
            a = test_answers_3.get(1);
            b = test_answers_3.get(2);
            c = test_answers_3.get(3);
            return connectionAnswers(a, b, c);

        } else if (Objects.equals(task, "test_answers_4")) {
            a = test_answers_4.get(1);
            b = test_answers_4.get(2);
            c = test_answers_4.get(3);
            return connectionAnswers(a, b, c);
        }
        return "";
    }

    private String examinationTestText(int a, String task) {
        if (Objects.equals(task, "test_answers_1")) {
            return test_answers_1.get(a);

        } else if (Objects.equals(task, "test_answers_2")) {
            return test_answers_2.get(a);

        } else if (Objects.equals(task, "test_answers_3")) {
            return test_answers_3.get(a);

        } else if (Objects.equals(task, "test_answers_4")) {
            return test_answers_4.get(a);

        }
        return "";
    }

    public void whileTest(int a, String task) {
        Scanner s = new Scanner(System.in);
        int input_int;
        String input_int_answers;

        System.out.println(test_text.get(a));
        System.out.println(testPrint(task));
        System.out.println("Введите число ответа.");
        while (true) {
            input_int = s.nextInt();
            input_int_answers = examinationTestText(input_int, task);
            if (Objects.equals(test_answers.get(a), input_int_answers)) {
                System.out.println("Отлично, ты прав!");
                break;
            } else {
                System.out.println("Пожалуйста, попробуйте еще раз.");
            }
        }
    }

    private String connectionAnswers(String a, String b, String c) {
        return "1. " + a + "\n2. " + b + "\n3. " + c;
    }
}