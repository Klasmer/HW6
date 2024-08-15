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
    }

}