package lesson15;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите предложение: ");
        String sentence = scanner.nextLine();
        
        String[] words = sentence.split(" ");
        String reversed = "";
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        
        System.out.println("Предложение с обратным порядком слов: " + reversed.trim());
        
        scanner.close();
    }
}
