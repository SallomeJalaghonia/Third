package org.example;
// მესამე დავალება
public class Lenght {
    public static void main(String[] args) {
        String words = "I love my life";
        // ითვლის სტრიქონის სიმბოლოების რაოდენობას და ინახავს შედეგს length
        int length = words.length();
        // შეამოწმებს არის თუ არა წინადადების სიგრძე ლუწი ან კენტი
            if (words.length() % 2 == 0) {
                System.out.println("არსებული სტრიქონის სიგრძე არის ლუწი");
            } else {
                System.out.println("არსებული სტრიქონის სიგრძე არის კენტი");
            }
    }
}