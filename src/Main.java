

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число больше 7: ");
        int num1 = scan.nextInt();  // задание 1
        if (num1 > 7) {
            System.out.println("Привет");
        }

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scan2.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав"); // задание 2
        } else {
            System.out.println("Нет такого имени");
        }
        System.out.print("Элементы, кратные 3: "); // задание 3
        int[] myArrayInt;
        myArrayInt = new int[100]; //для массива чисел от 1 до 100
        for (int i = 1; i < myArrayInt.length; i++) {
            myArrayInt[i] = i;
            if (myArrayInt[i] % 3 == 0) {
                System.out.print(myArrayInt[i] + ", ");
            }
        }

    }
    }

