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
    }

}