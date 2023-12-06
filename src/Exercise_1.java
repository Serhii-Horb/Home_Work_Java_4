import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        /* Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
        Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
        Например:
        ввод - mama, papa
        вывод - mapa */
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String str1 = sc.nextLine();
        System.out.print("Введите второе слово: ");
        String str2 = sc.nextLine();
        if (str1.length() % 2 != 0 || str2.length() % 2 != 0) {
            System.out.println("Введите слова которые состоят из чётного количества букв!");
        }
        System.out.println("Финальное слово: " + str1.substring(0, str1.length() / 2) + str2.substring(str2.length() / 2));
    }
}