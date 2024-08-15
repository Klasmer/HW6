public class Main {
    public static void main(String[] args) {
        //С помощью цикла for выведите в консоль все целые числа от 1 до 10.
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //С помощью цикла for выведите в консоль все целые числа от 10 до 1.
        System.out.println("Задача 2");
        for (int a = 10; a >= 1; a = a - 1) {
            System.out.println(a);
        }

        //Выведите в консоль все четные числа от 0 до 17.
        System.out.println("Задача 3");
        for (int b = 0; b <= 17; b = b + 2) {
            System.out.println("четные числа " + b);
        }

        //Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        System.out.println("Задача 4");
        for (int c = 10; c >= -10; c = c - 1) {
            System.out.println(c);
        }

        //Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096. В консоль результат должен выводиться в формате: «… год является високосным».
        System.out.println("Задача 5");
        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + " год является високосным");
        }

        //Напишите программу, которая выводит в консоль последовательность чисел:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.println("Задача 6");
        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println(f);
        }

        //Напишите программу, которая выводит в консоль последовательность чисел:
        //1 2 4 8 16 32 64 128 256 512
        System.out.println("Задача 7");
        for (int g = 1; g <= 512; g = g * 2) {
            System.out.println(g);
        }

        //Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        //Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        System.out.println("Задача 8");
        int savingsPerMonth = 29_000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total = total + savingsPerMonth;
            System.out.println("Месяц " + month + " , сумма накоплений = " + total + " рублей");
        }

        //Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в
        //банку», а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый
        //месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        System.out.println("Задача 9");
        int savings = 29_000;
        int interest = 0;
        for (int month1 = 1; month1 <= 12; month1++) {
            interest = interest + (interest + savings) * 1 / 100;
            interest = interest + savings;
            System.out.println("Месяц " + month1 + " , сумма накоплений = " + interest + " рублей");
        }

        //Напишите программу, которая выводит в консоль таблицу умножения на 2
        System.out.println("Задача 10");
        int number = 2;
        for (int n = 2; n <= 10; n++) {
            System.out.println(number + "*" + n + "=" + number * n);
        }
    }

}