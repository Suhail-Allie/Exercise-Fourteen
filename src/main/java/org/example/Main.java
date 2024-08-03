package org.example;

import java.util.Scanner;

import java.util.HashSet;

public class Main {

    // Method to remove duplicates from an array
    public static int[] eliminateDuplicates(int[] list) {
        HashSet<Integer> set = new HashSet<>();
        // Add elements to the HashSet (duplicates are automatically handled)
        for (int num : list) {
            set.add(num);
        }

        // Convert HashSet to int array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter ten integers:");
        // Read ten integers from the user
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Get unique numbers
        int[] uniqueNumbers = eliminateDuplicates(numbers);

        // Display unique numbers
        System.out.print("Unique numbers: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}