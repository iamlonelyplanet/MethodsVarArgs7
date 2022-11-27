public class PrimeNumbersWithMethods {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];
        int i = 0;
        int number = 2;

        while (i < 10) {
            System.out.println("Проверка числа " + number);

            if (checkDels (number, primeNumbers)) {
                primeNumbers[i] = number;
                i++;
            }
            number++;
        }

        int sum = 0;
        for (int a : primeNumbers) {
            System.out.print(a + " ");
            sum += a;
        }
        System.out.println();
        System.out.println(sum);
    }
    public static boolean checkDels (int number, int[] primeNumbers) {
        for (int del: primeNumbers) {
            if (del != 0 & del <= Math.sqrt(number)) {
                System.out.println("Проверяем делитель " + del);
                if (number % del == 0) {
                    System.out.println(number + " - составное число, т.к. делится на " + del);
                    return false;
                }
            }
        }
        return true;
    }
}