public class PrimeNumbersWithMethods {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];
        primeNumbers[0] = 2;
        int i = 1;
        int number = 3;

        while (i < 10) {
            System.out.println("Проверка числа " + number);

            if (checkDels (number)) {
                primeNumbers[i] = number;
                i++;
            }
            number++;
        }

        for (int a : primeNumbers) {
            System.out.print(a + " ");
        }
    }
    public static boolean checkDels (int number) {
        for (int del = 2; del <= Math.sqrt(number); del++) {
            System.out.println("Проверяем делитель " + del);

            if (number % del == 0) {
                System.out.println(number + " - составное число, оно делится на " + del);
                return false;
            }
        }
        return true;
    }
}