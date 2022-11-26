public class PrimeNumbers {
    public static void main(String[] args) {
        int[] primeNumbers = new int[100];
        primeNumbers[0] = 2;
        int i = 1;
        int number = 3;
        while (number < 100) {
            int check = 1;
            System.out.println("Проверка числа " + number);

            for (int del = 2; del <= Math.sqrt(number); del++) {
                System.out.println("Проверяем делитель " + del);
                check *= number % del;
                if (check == 0) {
                    System.out.println(number + " делится на " + del + ". Число " + number + " - составное, проверяем " + (number + 1));
                }
            }
            System.out.println(number + " - простое число");
            primeNumbers[i] = number;
            number++;
            i++;
            for (int a : primeNumbers) {
                if (a != 0) {
                    System.out.print(a + " ");
                }
            }
        }
    }
}