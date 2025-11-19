package lesson5;

public class MaxInArray {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 1, 8, 5};
        
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                System.out.println(max);
            }
        }
        
        System.out.println("Максимальное число в массиве: " + max);
    }
}
