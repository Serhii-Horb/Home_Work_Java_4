public class Exercise_2 {    public static void main(String[] args) {        /* Реализовать программу, выводящую на экран результаты:           Сложения двух чисел           Вычитания двух чисел           Умножения двух чисел           Деления двух чисел           Каждая из арифметических операций должна быть реализована как           два отдельных метода - один с типом void, второй - int. */        additionMethodVoid(2, 3);        System.out.println("Сумма чисел будет равна: " + additionMethodInt(2, 3));        subtractionMethodVoid(3, 2);        System.out.println("Разница чисел будет равна: " + subtractionMethodInt(3, 2));        productMethodVoid(2, 2);        System.out.println("Произведение чисел будет равно: " + productMethodInt(2, 2));        quotientMethodVoid(10, 5);        System.out.println("Частное чисел будет равно: " + quotientMethodInt(10, 5));    }    public static void additionMethodVoid(int a, int b) {        System.out.println("Сумма чисел будет равна: " + (a + b));    }    public static int additionMethodInt(int a, int b) {        return a + b;    }    public static void subtractionMethodVoid(int a, int b) {        System.out.println("Разница чисел будет равна: " + (a - b));    }    public static int subtractionMethodInt(int a, int b) {        return a - b;    }    public static void productMethodVoid(int a, int b) {        System.out.println("Произведение чисел будет равно: " + (a * b));    }    public static int productMethodInt(int a, int b) {        return a * b;    }    public static void quotientMethodVoid(int a, int b) {        System.out.println("Частное чисел будет равно: " + (a / b));    }    public static int quotientMethodInt(int a, int b) {        return a / b;    }}