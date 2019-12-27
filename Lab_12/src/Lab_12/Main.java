package Lab_12;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("------- Задание 1 --------------------------------------");
        Task1();
        System.out.println("------- Задание 2 --------------------------------------");
        Task2();
        System.out.println("------- Задание 3 --------------------------------------");
        Task3();
        System.out.println("------- Задание 4 --------------------------------------");
        Task4();
        System.out.println("------- Задание 5 --------------------------------------");
        Task5();
        System.out.println("------- Задание 6 --------------------------------------");
        Task6();
        System.out.println("------- Задание 7 --------------------------------------");
        Task7();
    }

    public static void Task1() {
        System.out.println("Введите строку и разделитель");
        String line = scanner.nextLine();
        String splitter = scanner.nextLine();
        System.out.println(Arrays.toString(line.split(splitter)));
    }

    public static void Task2() {
        String reg = "^abcdefghijklmnopqrstuv18340$";
        String right = "abcdefghijklmnopqrstuv18340";
        String wrong = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(IsSuitToEny(right, reg) + " " + IsSuitToEny(wrong, reg));
    }

    public static void Task3() {
        String text = "Дан текст со списками цен. Извлечь из него цены в 15 USD, 66 RUВ, EU. \n" +
                "– пример правильных выражений: 25.98 USD. \n" +
                "– пример неправильных выражений: 44 ERR, 0.004 EU.\n";

        Pattern pattern = Pattern.compile("(\\s\\d+|\\d+\\.\\d{1,2})\\s(USD|RUB|EU)(\\.|\\s|\\,)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find())
            System.out.println(matcher.group().trim());
    }

    public static void Task4() {
        String regExp = "\\d\\s?\\+";
        String exp = "(1 + 8) - 9 / 4";

        Pattern pat = Pattern.compile(regExp);
        Matcher match = pat.matcher(exp);

        System.out.println(match.find());
    }

    public static void Task5() {
        String date = scanner.nextLine();
        String r_31 = "(0[1-9]|[12][0-9]|31)/(0[13578]|10|12)/(19[0-9][0-9]|[2-9][0-9]{3})";    //1 3 5 7 8 10 12
        String r_30 = "(0[1-9]|[12][0-9]|30)/(0[2469]|11)/(19[0-9][0-9]|[2-9][0-9]{3})";        //2 4 6 9 11

        System.out.println(IsSuitToEny(date, r_30, r_31));

    }

    public static void Task6() {

        String pattern = "[0-9a-zA-Z\\._-]+@[a-z0-9-]+(\\.[a-z0-9-_]+)*(\\.[a-z]{2,})?";
        String text = scanner.nextLine();
        System.out.println(IsSuitToEny(text, pattern));

    }

    public static void Task7() {

        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[0-9a-zA-Z]{8,}$";
        String text = scanner.nextLine();

        System.out.println(IsSuitToEny(text, pattern));
    }

    private static boolean IsSuitToEny(String word, String... pattern) {
        for(int i = 0; i < pattern.length; i++)
            if (Pattern.matches(pattern[i], word))
                return true;
        return false;
    }
}
