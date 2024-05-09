package ru.lab.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReadAndWriteService {
    public static void generateRandomNumbersFile(int count, int maxNumber) {
        File directory = new File("files");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        File file = new File(directory, "numbers.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int randomNumber = random.nextInt(maxNumber) + 1;
                writer.write(randomNumber + " ");
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    public static List<Integer> readFileWithNumbers(String path) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            if (line != null) {
                String[] arrayNumbers = line.split(" ");
                for (String token : arrayNumbers) {
                    try {
                        numbers.add(Integer.parseInt(token));
                    } catch (NumberFormatException e) {
                        System.err.println("Ошибка преобразования в число: " + token);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла: " + e.getMessage());
        }
        return numbers;
    }
}
